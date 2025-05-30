package bomin;
import java.util.Scanner;
public class hw10_1 {
    public static void main(String[] args) {
        System.out.println("hw10_1:김보민");

        Scanner sc = new Scanner(System.in); //scanner 객체 사용하여 입력 받기

        int n = sc.nextInt(); // 정수 n개 입력 받고

        // 최대 간선 수는 n(n-1)/2
        Edge[] edgeList = new Edge[100]; //배열의 크기는 100으로
        int edgeCount = 0; // 실제 간선 수

        // 인접행렬을 입력받아 간선 배열 구성
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int weight = sc.nextInt(); // i와 j의 가선 가중치 입력 받기
                if (i < j && weight > 0) { // 대각선 기준 위쪽만 확인해서 중복 저장 방지하기. 0이면 제외
                    edgeList[edgeCount++] = new Edge(i, j, weight); //새로운 간선 객체를 만들어 배열에 넣고, 간선 수 1 증가 시키기
                }
            }
        }

        // 입력된 모든 간선을 (u,v,weight) 형식으로 출력
        for (int i = 0; i < edgeCount; i++) {
            System.out.print("(" + edgeList[i].u + "," + edgeList[i].v + "," + edgeList[i].weight + ") ");
        }
        System.out.println(); // 줄바꿈

        //크루스칼 알고리즘을 실행함. 정점 수, 간선 배열, 간선 수를 넘김.
        kruskal(n, edgeList, edgeCount);
    }

    // u와 v는 연결된 두 정점, weight는 가중치.
    static class Edge {
        int u, v, weight; // 시작 정점, 끝 정점, 가중치

        // 생성자: 간선을 만들 때 세 값을 넣어서 초기화할 수 있음.
        public Edge(int u, int v, int weight) {
            this.u = u;
            this.v = v;
            this.weight = weight;
        }
    }

    // 상호배타적 집합을 위한 부모와 랭크 배열
    static int[] parent; // 각 정점의 부모 노드를 저장
    static int[] rank;   // rank[i]는 트리의 높이를 추적하기 위한 값.

    // Kruskal 알고리즘 구현
    public static void kruskal(int n, Edge[] edges, int edgeCount) {
        // 정렬 부분. Collections.sort() 못 쓰니까 직접 선택 정렬 구현함.
        //간선의 가중치 기준으로 오름차순 정렬.
        for (int i = 0; i < edgeCount - 1; i++) {
            for (int j = i + 1; j < edgeCount; j++) {
                if (edges[i].weight > edges[j].weight) {
                    Edge temp = edges[i];
                    edges[i] = edges[j];
                    edges[j] = temp;
                }
            }
        }

        // 각 정점마다 집합을 만들기 위해 초기화
        parent = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i; // 자기 자신을 부모로 설정
            rank[i] = 0;   // 초기 랭크는 0
        }

        // 최소신장트리는 항상 n-1개의 간선을 가지므로 그만큼 저장할 배열 생성.
        Edge[] mst = new Edge[n - 1];
        int mstCount = 0;

        // 정렬된 간선을 하나씩 확인하며 MST 구성
        for (int i = 0; i < edgeCount; i++) {
            Edge edge = edges[i]; // 현재 간선

            // 두 정점의 루트를 찾아서 사이클 여부 확인
            int rootU = findSet(edge.u);
            int rootV = findSet(edge.v);

            if (rootU != rootV) { // 사이클이 없을 경우
                mst[mstCount++] = edge; // MST에 간선 추가
                union(rootU, rootV);    // 두 집합을 합침
            }

            // 서로 다른 집합이면 사이클이 아니므로 MST에 추가.
            //그리고 두 트리를 합침.
            //간선이 n-1개 되면 MST 완성, 반복 종료.
            if (mstCount == n - 1) break;
        }

        // MST 간선 목록 출력
        for (int i = 0; i < mstCount; i++) {
            System.out.print("(" + mst[i].u + "," + mst[i].v + "," + mst[i].weight + ") ");
        }
        System.out.println(); // 줄바꿈
    }

    // 재귀적으로 루트를 찾고, 중간 경로에 있는 노드들의 부모도 루트로 바꿔줌
    public static int findSet(int x) {
        if (parent[x] != x) {
            parent[x] = findSet(parent[x]); // 재귀적으로 부모 갱신 (경로 압축)
        }
        return parent[x]; // 최종 루트 반환
    }

    // 랭크 기반 Union 연산
    public static void union(int x, int y) {
        if (rank[x] < rank[y]) {
            parent[x] = y; // x의 부모를 y로 설정
        } else {
            parent[y] = x; // y의 부모를 x로 설정
            if (rank[x] == rank[y]) {
                rank[x]++; // 같은 높이면 x의 랭크 증가
            }
        }
    }
}