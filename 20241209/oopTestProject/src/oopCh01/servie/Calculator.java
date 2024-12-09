package oopCh01.servie;

 public class Calculator { // 외부에서 보이게 공유할거면 public
   public void add() {
        System.out.println("더하기 메서드");
    }
    void minus() {
        System.out.println("빼기 메서드");
    }

     private void multiple() {  // 나혼자 관리할거면 private
         System.out.println("곱하기 메서드");
     }
}
