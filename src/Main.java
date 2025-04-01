//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class VArray {
    public static void main(String[] args) {
        VArray v = new VArray(5);
        System.out.println("용량 : " + v.capacity + "저장된 개수 : " + v.size());

        for(int i = 0; i < 7; i++) {
            v.add(i);

            System.out.println("용량 : " + v.capacity() + ", 저장된 개수 : " + v.size());
            v.printAll();

            v.insert(3, 100);
            v.insert(5, 200);

            System.out.println("용량 : " + v.capacity() + ", 저장된 개수 : " + v.size());
            v.printAll();

            v.remove(10);
            System.out.println("용량 : " + v.capacity() + ", 저장된 개수 : " + v.size());
            v.printAll();

            for(int i = 50; i<55; i++){
                v.add(i);
            }
            System.out.println("용량 : " + v.capacity() + ", 저장된 개수 : " + v.size());
            v.printAll();
        }
    }
}