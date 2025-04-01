public class VArray {
    int size;  // 현재 배열에 저장된 요소 개수
    int[] array; // 실제 데이터를 저장하는 배열

    // 생성자: 초기 용량을 가진 배열을 생성
    public VArray(int capacity) {
        size = 0;  // 초기에는 요소가 없으므로 크기는 0
        array = new int[capacity]; // 지정된 크기의 배열을 생성
    }

    // 배열의 전체 용량 반환
    public int capacity() {
        return array.length;
    }

    // 현재 저장된 요소 개수 반환
    public int size() {
        return size;
    }

    // 배열의 마지막에 요소 추가
    public void add(int n) {
        if (size == array.length) { // 배열이 꽉 찼다면 크기를 증가
            resize();
        }
        array[size++] = n; // 요소 추가 후 size 증가
    }

    // 특정 인덱스에 요소 삽입
    public void insert(int idx, int n) {
        if (idx < 0 || idx > size) return; // 유효한 인덱스가 아닐 경우 무시
        if (size == array.length) resize(); // 배열이 가득 찼으면 크기 확장

        // 요소를 한 칸씩 뒤로 이동 (뒤에서부터 앞으로 이동)
        for (int i = size; i > idx; i--) {
            array[i] = array[i - 1];
        }
        array[idx] = n; // 해당 위치에 새로운 값 삽입
        size++; // 크기 증가
    }

    // 배열 크기를 두 배로 확장
    public void resize() {
        int newCapacity = array.length * 2; // 새로운 용량은 기존의 2배
        int[] newArray = new int[newCapacity]; // 새로운 배열 생성
        System.arraycopy(array, 0, newArray, 0, array.length); // 기존 배열 복사
        array = newArray; // 새로운 배열로 교체
    }

    // 특정 인덱스의 요소 삭제
    public void remove(int idx) {
        if (idx >= size || idx < 0) return; // 유효하지 않은 인덱스면 무시

        // 요소를 한 칸씩 앞으로 이동 (삭제한 위치부터 끝까지)
        for (int i = idx; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[--size] = 0; // 마지막 요소 제거
    }

    // 배열의 모든 요소 출력
    public void printAll() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
