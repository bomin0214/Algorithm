package bomin.goorm;

import java.io.*;
import java.util.*;

public class B1991 {
    static class Node {
        char data;
        Node left, right;

        Node(char data) {
            this.data = data;
        }
    }

    static Node root;
    static Map<Character, Node> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // 트리 구성
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            char parent = input[0].charAt(0);
            char left = input[1].charAt(0);
            char right = input[2].charAt(0);

            // 부모 노드 생성 or 가져오기
            Node parentNode = map.getOrDefault(parent, new Node(parent));
            map.put(parent, parentNode);
            if (i == 0) root = parentNode;

            // 왼쪽 자식
            if (left != '.') {
                Node leftNode = new Node(left);
                parentNode.left = leftNode;
                map.put(left, leftNode);
            }

            // 오른쪽 자식
            if (right != '.') {
                Node rightNode = new Node(right);
                parentNode.right = rightNode;
                map.put(right, rightNode);
            }
        }

        // 전위 순회
        preorder(root);
        System.out.println();

        // 중위 순회
        inorder(root);
        System.out.println();

        // 후위 순회
        postorder(root);
        System.out.println();
    }

    // 전위 순회: 루트 → 왼쪽 → 오른쪽
    static void preorder(Node node) {
        if (node == null) return;
        System.out.print(node.data);
        preorder(node.left);
        preorder(node.right);
    }

    // 중위 순회: 왼쪽 → 루트 → 오른쪽
    static void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.data);
        inorder(node.right);
    }

    // 후위 순회: 왼쪽 → 오른쪽 → 루트
    static void postorder(Node node) {
        if (node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data);
    }
}
