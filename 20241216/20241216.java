원시타입 데이터도 비교할 때는 주소를 갖고 비교를 합니다.

constant(상수) pool (저장)

int a = 3 ;      100번지 -> 3  
int b = 3;       b -> 100번지              *같은 숫자면 같은번지 
b= 5;            b----> 104번지 5         * 다른숫자면 다른 번지를 새롭게 만들어줌




String str1 = "장원영";
String str2 = "장원영";
 
==
  


String str3 = new String("장원영");
String str4 = new String("장원영");

str3 = 1000번지 "장원영"
str4 = 2000번지 "장원영"
!=


Person p1 = new Person("장원영" ,20);
Person p2 = new Person("장원영",20);







데이터구조(자료구조)

Collections.+

ArrayList : 중복 허용
List<담을타입> 이름 = new ArrayList<>();
-삽입, 삭제가 자유롭다.
이름.size(), indexOf(), add(), set(), remove() .....

Set : 중복불가 
Set<type> name = new HashSet<>();

Map <키의 타입, 값의 타입> : 중복 허용
키, 값





* 주소록 -> Map타입으로 변경   ** 과제 ** 