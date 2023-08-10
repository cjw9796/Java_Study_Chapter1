
public class Person {
    String name;
    int age;

    public Person() {} //기본생성자

    public Person(String name, int age) { //매개변수를 가지는 생성자 
        this.name = name;
        this.age = age;
    }
}

public class Calculator {
    public static int add(int x, int y) {
        return x + y;
    }

    public static double add(double x, double y) {
        return x + y;
    }
}

public class Test1 {
    public static void main(String[] args) {
        Person person = new Person("John", 30); //매개변수 생성자 호출
        
        Person[] people = new Person[3];
        people[0] = new Person("Alice", 24);
        people[1] = new Person("Bob", 32);
        people[2] = new Person("Charlie", 18);
        
        for(people )
    }
}




/*
 * 시험(총 9문제)


1. 클래스 다이어그램 
접근제어자 public(+), private(-) 

- public
어떤 패키지에서든 접근 가능
다른 패키지에서도 접근 가능

protected
-같은 패키지 내에서는 접근 가능
-다른 패키지에서는 상속받은 경우에만 접근 가능

default (package-private)
-같은 패키지 내에서만 접근 가능
-접근 제어자를 지정하지 않으면 자동으로 default 접근 제어자가 적용됩니다.

private
-같은 클래스 내에서만 접근 가능

2. 객체를 생성할 때 생성자 (기본생성자, 매개변수 주는 생성자)
기본 생성자(Default Constructor)와 매개변수를 가지는 생성자
(Parameterized Constructor)의 차이점은 매개변수 유무입니다.
public class Person {
    String name;
    int age;

    public Person() {} //기본생성자

    public Person(String name, int age) { //매개변수를 가지는 생성자 
        this.name = name;
        this.age = age;
    }
}

-기본 생성자는 클래스에 정의된 생성자가 하나도 없을 때 자동으로 생성되며 매개변수를 가지지 않는다.
-기본생성자는 클래스의 인스턴스를 생성할 때 호출됨

-반면에 매개변수를 가지는 생성자는 인스턴스 변수를 초기화할 때 필요한 값을 생성자의 매개변수로 전달
-이렇게 생성자를 정의하면, 객체 생성과 동시에 생성자의 매개변수를 통해 인스턴스 변수를 초기화할 수 있음

3. 함수를 똑같은 이름으로 여러개 만들 수 있다. (메서드 오버로딩)
-하나의 클래스 내에서 같은 이름의 메서드를 여러 개 정의하는 것을 말합니다.
-메 서드의 이름과 매개변수의 개수, 타입, 순서가 달라야 한다. 
-장점: 같은 이름을 가진 메서드를 여러개 정의할 수 있어서 이름만으로 기능을 파악할 수 있어 가독성이 높아진다.
-같은 이름을 갖는 메서드들은 같은 목적을 가지므로, 코드의 일관성을 유지할 수 있다. 

public class Calculator {
    public int add(int x, int y) {
        return x + y;
    }

    public int add(int x, int y, int z) {
        return x + y + z;
    }

    public double add(double x, double y) {
        return x + y;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result1 = calculator.add(1, 2);
        int result2 = calculator.add(1, 2, 3);
        double result3 = calculator.add(1.0, 2.0);
    }
}

4. 부모한테 상속받은 함수의 내용 변경하는 것 (메서드 오버라이딩)
-메서드 오버라이딩(Overriding)은 상위 클래스에서 이미 정의된 메서드를 하위 클래스에서 다시 정의하는 것을 말합니다.
-하위 클래스에서 오버라이딩한 메서드는 상위 클래스에서 정의한 메서드와 이름, 매개변수, 반환값이 모두 같아야 합니다.
-메서드 오버라이딩은 다형성(Polymorphism)의 개념을 구현하는 중요한 기술 중 하나입니다.
-다형성이란, 같은 이름의 메서드가 다른 동작을 하도록 하는 것을 말합니다.
-이를 통해 상속 관계에서 하위 클래스에서 상위 클래스의 메서드를 재정의하여 다른 기능을 수행하게 할 수 있습니다.

public class Animal {
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}

public class Dog extends Animal {
    @Override
    public void move() {
        System.out.println("강아지가 뛰어다닙니다.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        animal.move(); // "동물이 움직입니다." 출력
        dog.move(); // "강아지가 뛰어다닙니다." 출력
    }
}

5. 문자열에서 문자를 구분, 치환(변경), 비교, 문자열 자르는 내용 


1. 문자를 구분하는 함수: `split()`
   - 문자열을 특정 구분자를 기준으로 나누어 배열로 반환합니다.
   - 예시: `"apple,banana,grape".split(",")`는 `["apple", "banana", "grape"]`를 반환합니다.

2. 문자를 치환(변경)하는 함수: `replace()`
   - 문자열에서 특정 문자열을 찾아 다른 문자열로 변경합니다.
   - 예시: `"Hello, World!".replace("Hello", "Hi")`는 `"Hi, World!"`를 반환합니다.

3. 문자열을 비교하는 함수: `equals()`
   - 두 개의 문자열이 같은지 비교합니다.
   - 예시: `"apple".equals("banana")`는 `false`를 반환합니다.

4. 문자열을 자르는 함수: `substring()`
   - 문자열의 일부분을 추출합니다.
   - 예시: `"Hello, World!".substring(0, 5)`는 `"Hello"`를 반환합니다.

위 함수들은 모두 Java의 `String` 클래스의 멤버 함수로 제공됩니다. 
추가적으로, `split()` 함수와 `substring()` 함수는 반환되는 값이 새로운 문자열이 아니라 문자열의 일부분이거나 배열이므로, 이를 활용하여 문자열을 조작할 수 있습니다.

6. 배열 
-객체 생성. 
// 크기가 5인 int형 배열 생성
int[] arr1 = new int[5];

// 초기값을 가지는 int형 배열 생성
int[] arr2 = {1, 2, 3, 4, 5};

// 배열 변수만 생성하고, 나중에 배열 객체 생성
int[] arr3;
arr3 = new int[]{1, 2, 3, 4, 5};


-안에 있는 내용들을 출력
// 배열 선언
int[] arr = {1, 2, 3, 4, 5};

// for문을 이용한 출력
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}

// Enhanced for문을 이용한 출력
for (int num : arr) {
    System.out.println(num);
}
-private 된 경우  
private로 선언된 배열의 경우, 해당 클래스에서만 접근이 가능합니다. 
따라서 해당 클래스 내부에서 배열 객체를 생성하고, 메서드를 이용하여 배열 안에 있는 내용을 반환하거나 출력할 수 있습니다.
public class MyClass {
    private int[] arr = {1, 2, 3, 4, 5};

    public int[] getArr() {
        return arr;
    }

    public void printArr() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

-private 된 경우2 
private 접근 제한자로 선언된 클래스의 배열을 출력하려면 해당 클래스 내부에서 getter 메서드를 구현하여 배열을 반환하는 방법이 있습니다. 
public class MyClass {
    private int[] myArray;

    public MyClass(int[] arr) {
        this.myArray = arr;
    }

    private int[] getMyArray() {
        return this.myArray;
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass(new int[] {1, 2, 3, 4, 5});
        int[] arr = obj.getMyArray();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
위 코드에서 MyClass는 private 접근 제한자로 선언되었고, 해당 클래스 내부에는 int형 배열 myArray가 선언되어 있습니다. 
getMyArray() 메서드는 해당 배열을 반환하는 메서드로, 외부에서는 이 메서드를 통해서만 해당 배열을 접근할 수 있습니다.
Main 클래스에서는 MyClass 객체를 생성하고 getMyArray() 메서드를 통해 배열을 반환받아 for문을 통해 출력하고 있습니다.

 
-public으로 된 경우 
-default로 된 경우 
public 또는 default로 선언된 배열의 경우, 해당 클래스가 선언된 패키지에서 모두 접근 가능합니다. 
따라서 배열 객체를 생성한 후, 메서드를 이용하여 배열 안에 있는 내용을 반환하거나 출력할 수 있습니다.
public class MyClass {
    public int[] arr = {1, 2, 3, 4, 5};

    public int[] getArr() {
        return arr;
    }

    public void printArr() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}


-public으로 된 경우 2 

public class MyClass {
    public int[] myArray;

    public MyClass(int[] arr) {
        this.myArray = arr;
    }

    public int[] getMyArray() {
        return this.myArray;
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass(new int[] {1, 2, 3, 4, 5});
        int[] arr = obj.getMyArray();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

위 코드에서 MyClass는 public 접근 제한자로 선언되었고, 해당 클래스 내부에는 public으로 선언된 int형 배열 myArray가 선언되어 있습니다. 
getMyArray() 메서드는 해당 배열을 반환하는 메서드로, 외부에서도 이 메서드를 통해 해당 배열에 접근할 수 있습니다.
Main 클래스에서는 MyClass 객체를 생성하고 getMyArray() 메서드를 통해 배열을 반환받아 for문을 통해 출력하고 있습니다.


7. linkedlist 사용법, arraylist 사용법
-둘의 차이점이 뭔지 
-내용을 출력하려면? 함수의 사용 방법(제공하는 함수)

*LinkedList는 자바에서 제공하는 연결 리스트 자료구조를 구현한 클래스
-데이터를 추가, 삭제하기 쉽다는 장점
-LinkedList는 리스트의 중간에 데이터를 삽입하거나 삭제하는 연산을 빠르게 처리할 수 있습니다. 

LinkedList<String> list = new LinkedList<String>(); //객체 생성
list.add("apple"); //데이터 추가 add() 
list.remove("banana"); //데이터 삭제 
String first = list.get(0); //데이터 접근 (첫번째 데이터) get()
String last = list.get(list.size() - 1); //데이터 접근(마지막 데이터)

list.set(1, "orange"); //데이터 수정 set(0

import java.util.LinkedList;

public class Main {  //linkedlist 출력 예제 
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("orange");

        for (String s : linkedList) {
            System.out.println(s);
        }
    }
}

*ArrayList는 자바에서 제공하는 동적 배열 자료구조입니다. 
이전에 크기가 정해진 배열과 달리, ArrayList는 크기를 지정하지 않아도 되며, 필요에 따라 동적으로 크기가 조정됩니다.

ArrayList<String> list = new ArrayList<String>(); // ArrayList 생성
ArrayList<String> list = new ArrayList<>(); // 자료형을 지정하지 않음
list.add("Apple"); // 요소 추가
list.add("Banana");
list.add("Cherry");
String fruit = list.get(0); // 첫 번째 요소를 가져옴
System.out.println(fruit); // "Apple" 출력
list.set(1, "Grape"); // 두 번째 요소를 "Grape"로 수정
list.remove(2); // 세 번째 요소를 제거
int size = list.size(); // ArrayList의 크기를 구함
ArrayList의 모든 요소를 출력하려면 for-each 루프를 사용
for (String fruit : list) {
    System.out.println(fruit);
}

8. 입출력(I/O)
-모드가 뭔지 , 경로 
자바 입출력에서 모드란 파일을 열 때 어떤 방식으로 열 것인지를 결정하는 것을 의미합니다. 모드는 크게 읽기(read), 쓰기(write), 추가(append) 모드가 있습니다.

- 읽기 모드: 파일을 읽기 위해 열 때 사용합니다. 파일이 존재하지 않으면 오류가 발생합니다.

아래 예제: BufferedReader 클래스를 사용하여 파일을 읽기 모드로 열었습니다. readLine() 메서드를 이용하여 한 줄씩 읽어와서 출력합니다.
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        String filePath = "C:/example/file.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("파일을 읽는 중 오류가 발생하였습니다.");
            e.printStackTrace();
        }
    }
}
- 쓰기 모드: 파일에 데이터를 쓰기 위해 열 때 사용합니다. 파일이 존재하지 않으면 새로운 파일을 생성합니다. 파일이 존재하면 파일의 기존 내용을 덮어쓰게 됩니다.
-FileWriter 클래스는 새 파일을 생성하거나 파일을 덮어쓰기 위해 사용됩니다. write() 메서드를 호출하여 파일에 문자열을 쓸 수 있습니다. 파일을 닫으려면 close() 메서드를 호출합니다.
위 예제를 실행하면 "output.txt" 파일이 생성되고, 파일 안에는 "Hello, World!" 문자열이 저장됩니다.
import java.io.FileWriter;
import java.io.IOException;

public class WriteExample {
    public static void main(String[] args) {
        String fileName = "output.txt";
        String fileContent = "Hello, World!";
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(fileContent);
            fileWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}


- 추가 모드: 파일의 끝에 데이터를 추가하기 위해 열 때 사용합니다. 파일이 존재하지 않으면 새로운 파일을 생성합니다.
추가모드는 FileWriter와 FileOutputStream 클래스에서 지원하며, FileWriter의 경우 생성자에서 append 값을 true로 설정하면 추가모드가 됩니다.
import java.io.*;

public class AppendExample {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("output.txt", true);
            writer.write("This is a new line in append mode.\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
위 예제에서는 FileWriter 클래스를 사용하여 "output.txt" 파일에 문자열을 추가합니다. 
FileWriter 생성자에서 두 번째 매개변수로 true를 전달하여 추가모드를 설정합니다. 이후 write 메서드를 사용하여 새로운 문자열을 파일 끝에 추가합니다.

경로는 파일이 저장된 위치를 나타내는 것으로, 파일을 찾거나 저장할 때 필요합니다. 경로에는 절대경로와 상대경로가 있습니다.

- 절대경로: 파일의 전체 경로를 나타내는 것으로, 파일이 저장된 드라이브나 루트 디렉토리부터 시작하여 파일의 위치까지 모든 경로를 포함합니다.
- 상대경로: 현재 작업 중인 디렉토리를 기준으로 파일의 위치를 나타내는 것으로, 현재 디렉토리에서부터 상대적인 위치를 나타냅니다. 상대경로를 사용할 때는 "./"이나 "../"와 같은 특수한 기호를 사용하여 상대적인 위치를 나타냅니다.

자바에서 입출력은 java.io 패키지에서 제공됩니다. 대표적으로 InputStream, OutputStream, Reader, Writer 등이 있습니다.

InputStream과 OutputStream은 바이트(byte) 단위로 입출력을 처리하고, Reader와 Writer는 문자(char) 단위로 입출력을 처리합니다.

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class IOExample {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in; // 표준 입력 스트림(System.in)을 얻어옴
        InputStreamReader isr = new InputStreamReader(is); // 바이트 스트림을 문자 스트림으로 변환
        BufferedReader br = new BufferedReader(isr); // 문자 스트림을 버퍼링하여 처리 성능 향상

        String line = br.readLine(); // 한 줄 읽기
        System.out.println(line); // 화면 출력

        br.close(); // 스트림 닫기
    }
}

FileInputStream, FileOutputStream, FileReader, FileWriter 등을 이용하여 파일로부터 데이터를 읽어오거나 파일에 데이터를 쓸 수 있습니다.

-문자 저장을 할 때 사용하는 클래스 
자바 입출력에서 문자 저장을 할 때는 Writer와 OutputStreamWriter 클래스를 사용
또한, FileWriter 클래스는 파일에 문자를 저장하는 기능을 제공
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Hello, world!");
            writer.close();
            System.out.println("문자열을 파일에 저장했습니다.");
        } catch (IOException e) {
            System.out.println("파일에 문자열을 저장하는 중 오류가 발생했습니다.");
            e.printStackTrace();
        }
    }
}

-이진 파일 저장 읽어오는 클래스
Java에서 이진 파일을 저장하고 읽어오는 클래스는 FileInputStream과 FileOutputStream이다.

FileInputStream 클래스는 파일로부터 데이터를 읽어오는데 사용되며, FileOutputStream 클래스는 파일에 데이터를 쓰는데 사용된다.

import java.io.*;

public class BinaryFileIOExample {
    public static void main(String[] args) {
        String fileName = "binaryfile.dat";
        int[] data = {1, 2, 3, 4, 5};

        // 데이터 쓰기
        try (FileOutputStream fos = new FileOutputStream(fileName);
             DataOutputStream dos = new DataOutputStream(fos)) {
            for (int i = 0; i < data.length; i++) {
                dos.writeInt(data[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 데이터 읽기
        try (FileInputStream fis = new FileInputStream(fileName);
             DataInputStream dis = new DataInputStream(fis)) {
            while (dis.available() > 0) {
                System.out.print(dis.readInt() + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
위 코드는 binaryfile.dat 파일에 1, 2, 3, 4, 5 값을 이진 형식으로 쓰고, 그 파일에서 값을 읽어와서 출력하는 예제이다. DataInputStream과 DataOutputStream 클래스를 사용하여 값을 읽고 쓰기 때문에 이진 형식으로 저장하고 읽어온다. 
이진 형식으로 저장하고 읽어올 때는 writeInt()와 readInt() 함수를 사용한다.


9. 네트워크 
-가장 중요한 것 : 소켓
소켓(Socket)은 컴퓨터 네트워크에서 프로세스 간 통신을 위한 일종의 인터페이스를 제공하는 소프트웨어 객체입니다. 소켓은 인터넷 프로토콜(IP)을 기반으로 하며, 클라이언트/서버 모델의 네트워크 통신에서 중요한 역할을 담당합니다. 
소켓은 IP 주소와 포트 번호로 식별되며, 프로세스 간 데이터 전송을 담당합니다. 소켓은 네트워크 통신에서 가장 기본적이면서도 중요한 개념 중 하나입니다.

문제1.-통신 시 누굴 먼저 실행? (서버)
일반적으로 서버를 먼저 실행하는 것이 좋습니다. 서버가 먼저 실행되어 클라이언트의 요청을 대기할 준비를 마치고, 클라이언트가 서버에 연결할 수 있도록 대기하는 상태가 되어야 합니다. 
따라서 클라이언트가 먼저 실행되는 경우, 서버가 실행되지 않은 상태에서 연결을 시도하면 연결 오류가 발생합니다.



문제2.소켓이 클라이언트에 어떻게 들어가는지, 서버에 어떻게 들어가는지 
자바 네트워크 프로그래밍에서 소켓(Socket)은 클라이언트와 서버 간의 통신에 사용됩니다. 클라이언트에서는 소켓을 생성하여 서버에 접속하고, 서버에서는 소켓을 생성하여 클라이언트의 접속을 수락합니다.

클라이언트에서 소켓을 생성하는 방법은 다음과 같습니다.

```java
Socket socket = new Socket(serverAddress, port);
```

위 코드에서 `serverAddress`는 접속하려는 서버의 IP 주소나 도메인 이름이며, `port`는 접속하려는 서버의 포트 번호입니다. 이렇게 소켓을 생성하면 서버에 접속할 수 있습니다.

서버에서는 소켓을 생성하여 클라이언트의 접속을 수락하는데, 다음과 같은 방법으로 소켓을 생성합니다.

```java
ServerSocket serverSocket = new ServerSocket(port);
Socket clientSocket = serverSocket.accept();
```

위 코드에서 `port`는 서버가 바인딩할 포트 번호입니다. `ServerSocket`을 생성하면 클라이언트의 접속을 대기하는 상태가 되고, `accept()` 메서드를 호출하면 클라이언트의 접속을 수락하고 해당 클라이언트와 통신할 소켓인 `clientSocket`을 반환합니다.

따라서 서버에서는 `ServerSocket`을 생성하여 클라이언트의 접속을 대기하고, 클라이언트가 접속하면 `accept()` 메서드를 호출하여 `clientSocket`을 얻어서 통신합니다.

```java
ServerSocket serverSocket = new ServerSocket(port);

while (true) {
    Socket clientSocket = serverSocket.accept();

    // 클라이언트와 통신하는 코드
}
```

이렇게 소켓을 생성하고 통신하는 방법으로 자바 네트워크 프로그래밍을 할 수 있습니다.

문제3.클라이언트랑 서버랑 소켓을 가지고 통신하다가 데이터를 꺼낼 때 어떻게 꺼내는지 
클라이언트와 서버가 소켓으로 통신하면 데이터를 송신할 때는 OutputStream을 사용하여 데이터를 송신하고, 데이터를 수신할 때는 InputStream을 사용하여 데이터를 수신합니다.

아래는 클라이언트에서 소켓으로 데이터를 송신하고 서버에서 수신하는 예제 코드입니다.

클라이언트 소켓에서 데이터 송신:

```java
Socket clientSocket = new Socket(serverName, port);
OutputStream outputStream = clientSocket.getOutputStream();

String message = "Hello, server!";
outputStream.write(message.getBytes());
```

서버 소켓에서 데이터 수신:

```java
ServerSocket serverSocket = new ServerSocket(port);
Socket serverSocket = serverSocket.accept();
InputStream inputStream = clientSocket.getInputStream();

byte[] buffer = new byte[1024];
int length = inputStream.read(buffer);
String message = new String(buffer, 0, length);
System.out.println("Received message: " + message);
```

위 코드에서는 OutputStream.write() 메소드를 사용하여 클라이언트에서 서버로 데이터를 송신하고, InputStream.read() 메소드를 사용하여 서버에서 클라이언트로부터 데이터를 수신합니다. 
수신한 데이터는 byte 배열로 읽어들인 후, String으로 변환하여 출력합니다.

10. 어떤 문제나 프로그램에 설계를 할 때 클래스 정의 
-1.접근제어자
-2. 데이터(변수) 멤버변수(필드) 수
-3. 기능(메서드) 멤버메서드 수 
-4. getter, setter

클래스 정의를 할 때 고려해야 할 사항은 다음과 같습니다.

1. 접근 제어자: 클래스의 접근 범위를 설정합니다. public, protected, private 등이 있습니다.

2. 데이터(변수) 멤버 변수(필드) 수: 클래스에서 사용하는 데이터의 수와 종류를 결정합니다.

3. 기능(메서드) 멤버 메서드 수: 클래스에서 제공하는 기능의 수와 종류를 결정합니다.

4. Getter, Setter: 필드에 대한 접근자와 설정자를 정의합니다. 이를 통해 캡슐화를 유지하면서 필드에 대한 접근을 가능하게 합니다.

클래스를 설계할 때는 이러한 사항을 고려하여 클래스를 구성하면 됩니다. 이를 통해 클래스의 구성을 일관성 있게 유지하고, 클래스를 활용하는 데 필요한 기능들을 쉽게 추가하거나 수정할 수 있습니다.

다음은 접근제어자, 멤버변수, 멤버메서드, getter, setter를 갖는 클래스 예제입니다.

```java
public class Car {
    // 멤버변수(필드)
    private String model;
    private int year;
    private String color;

    // 기본 생성자
    public Car() {
    }

    // 매개변수를 가지는 생성자
    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    // getter, setter 메서드
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // 멤버메서드
    public void start() {
        System.out.println(model + " starting...");
    }

    public void stop() {
        System.out.println(model + " stopping...");
    }
}
```

위 예제는 Car 클래스를 정의하고 있습니다. 이 클래스는 다음과 같은 멤버변수와 멤버메서드를 가지고 있습니다.

- 멤버변수: model, year, color
- 멤버메서드: start(), stop()
- getter, setter 메서드: getModel(), setModel(), getYear(), setYear(), getColor(), setColor()

이 클래스를 사용하면서, 멤버변수를 직접 접근하는 것이 아니라 getter와 setter 메서드를 이용해서 접근하는 것이 좋습니다. getter와 setter 메서드를 이용하면 멤버변수에 대한 접근제어를 할 수 있기 때문입니다.
 */