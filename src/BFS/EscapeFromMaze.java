package BFS;

import java.util.*;

public class EscapeFromMaze {

    //공통 받을 것
    static int[][] arr;
    static int N;
    static int M;


    //함수 선언
    private static int bfs(int x, int y){
        //java Queue 구현: 현재 위치 기준으로 사용한다
//        Queue<Integer> queue = new LinkedList<Integer>();
        Queue<Integer> queue = new ArrayQueue<>();
        queue.offer(x,y);

        return 1;
    }

    public static void main(String[] args) {
        System.out.println("세로:N 과 가로:M의 값을 입력하시오>> ");
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        //2차원 배열을 입력 받는다.
        arr = new int[N][M];
        System.out.println("2차원 배열을 입력하시오>>> ");
        sc.nextLine();//청소

        for(int i=0; i<N; i++){
            String temp = sc.nextLine();
            for(int j=0; j<M; j++){
                char c = temp.charAt(j);
                arr[i][j] = c -'0';
            }
        }// arr end

        System.out.println("입력 받은 배열 확인");
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){

                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        // 괴물: 0, 길: 1



    }

    private static class ArrayQueue implements Queue<Integer> {
        private static final int DEFAULT_CAPACITY = 50;

        private int capacity;
        private E[] elements;

        private int frontIdx;
        private int rearIdx;


        //== getter / setter ==//
        private int capacity() {
            return capacity;
        }

        private void setCapacity(int capacity) {
            this.capacity = capacity;
        }

        private E[] elements() {
            return elements;
        }

        private void setElements(E[] elements) {
            this.elements = elements;
        }

        public int frontIdx() {
            return frontIdx;
        }

        public void setFrontIdx(int frontIdx) {
            this.frontIdx = frontIdx;
        }

        public int rearIdx() {
            return rearIdx;
        }

        public void setRearIdx(int rearIdx) {
            this.rearIdx = rearIdx;
        }

        //== [Finish] - getter / setter ==//




        //== Constructor ==//
        @SuppressWarnings("unchecked")
        public ArrayQueue(int capacity) {
            this.capacity = capacity;
            setElements((E[])new Object[capacity]);
            setFrontIdx(0);
            setRearIdx(0);
        }


        public ArrayQueue() {
            this (DEFAULT_CAPACITY);
        }






        @Override
        public boolean isEmpty() {
            return frontIdx == rearIdx;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<Integer> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean isFull() {
            return rearIdx == capacity;
        }

        @Override
        public int size() {
            return rearIdx - frontIdx;
        }

        @Override
        public E front() {
            return this.elements[this.frontIdx];
        }

        @Override
        public E rear() {
            return this.elements[this.rearIdx-1];//rear은 원소가 들어오면 1 증가하여 비어있는 위치 가리킴
        }



        @Override
        public boolean offer(E item) {
            if (isFull()) grow();
            this.elements[rearIdx] = item;
            this.rearIdx ++;
            return true;
        }

        @Override
        public boolean add(Integer integer) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends Integer> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean offer(Integer integer) {
            return false;
        }

        @Override
        public Integer remove() {
            return null;
        }

        @Override
        public E poll() {
            if (isEmpty()) {return null;}

            E element = this.elements[frontIdx];
            this.elements[frontIdx] = null;
            this.frontIdx ++;
            return element;
        }

        @Override
        public Integer element() {
            return null;
        }

        @Override
        public E peek() {
            return null;
        }

        @Override
        @SuppressWarnings("unchecked")
        public void clear() {
            setElements( (E[]) new Object[this.capacity()]);
            setFrontIdx(0);
            setRearIdx(0);
        }

        /**
         * 배열의 크기를 2배로 늘려준다.
         */
        @SuppressWarnings("unchecked")
        private void grow() {
            setCapacity( capacity() * 2 );
            setElements( Arrays.copyOf( elements(), capacity()) );
        }
    }
}
