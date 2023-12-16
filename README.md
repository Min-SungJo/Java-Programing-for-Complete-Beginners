# Java-Programing-for-Complete-Beginners
## 문제 해결 과정
### 1. 문제 이해
### 2. 해결 방법 설계
문제를 여러 단계로 나누기
### 3. 프로그램 작성 및 테스트
문법을 이용하여 프로그램을 작성하고 테스트하기
## JShell
Java를 쉽게 배우기 위한 REPL(Read-Evaluate-Print Loop, 읽기-분석-출력-반복)
<br />
프로그램 전체를 작성하고 실행해 콘솔 창으로 출력할 필요 없이 코드 한 줄을 입력하여 결과를 바로 출력할 수 있음
<br />
(오류를 즉각적으로 알아낼 수 있음)
### 실행
터미널에 jshell 을 입력하여 실행

<img width="89" alt="image" src="https://github.com/Min-SungJo/Java-Programing-for-Complete-Beginners/assets/91239439/e53a0e96-ba71-494c-8f2e-6a776b083ec0">
<br />
<img width="288" alt="image" src="https://github.com/Min-SungJo/Java-Programing-for-Complete-Beginners/assets/91239439/034b0538-0b69-4df2-baf8-fafb9f2cc365">
<br />
jshell에 /help intro 를 입력하여 도움말 확인
<br />
<img width="592" alt="image" src="https://github.com/Min-SungJo/Java-Programing-for-Complete-Beginners/assets/91239439/25e89ed6-ea45-4889-881a-38f77e05cdd4">
<br />

```
jshell 도구는 자바 코드를 실행하여 즉각적인 결과를 얻을 수 있음

```
<img width="91" alt="image" src="https://github.com/Min-SungJo/Java-Programing-for-Complete-Beginners/assets/91239439/71094afb-e08f-4ec3-bfdb-67a6e749e612">
<br />
오류가 발생한 부분에 대해 피드백을 줌
<br />
<img width="122" alt="image" src="https://github.com/Min-SungJo/Java-Programing-for-Complete-Beginners/assets/91239439/901f1804-dde2-4ae9-91b1-ee3d60350fa1">
<br >

### 종료
jshell에 /exit을 입력하여 종료

<img width="208" alt="image" src="https://github.com/Min-SungJo/Java-Programing-for-Complete-Beginners/assets/91239439/b2b4acc6-844d-40f7-9505-dd5b16a997fc">
<br />

```
exit이 아닌 /exit

```

# JAVA Fundamentals
<details markdown="1">
  <summary>Programming</summary>
  <div>
    <ul>
      <li>컴퓨터가 작업을 수행할 수 있도록 명령을 만들어내는 것</li>
    </ul>
  </div>
</details>
<details markdown="1">
  <summary>Programming Language</summary>
  <div>
    <ul>
      <li>컴퓨어에게 어떤 작업을 수행하도록 지시하는 데 사용되는 언어, 이를 사용하여 소프트웨어를 개발하고 컴퓨터 시스템을 제어할 수 있음</li>
    </ul>
  </div>
</details>
<details markdown="1">
  <summary>Java</summary>
  <div>
    <ul>
      <li>클래스 기반이고 고수준인 객체지향 프로그래밍 언어, 클래스를 사용하여 객체를 정의하고, 고수준의 추상화를 제공하여 프로그래머가 상세한 구현 내용을 숨기는 객체지향 프로그래밍의 원칙을 따름</li>
      <li>컴퓨어에게 어떤 작업을 수행하도록 지시하는 데 사용되는 언어, 이를 사용하여 소프트웨어를 개발하고 컴퓨터 시스템을 제어할 수 있음</li>
    </ul>
  </div>
</details>
<details markdown="1">
  <summary>JShell</summary>
  <div>
    <ul>
      <li>코드를 대화식으로 테스트하고 평가하는 도구, REPL(Read-Eval-Print Loop)대화형 인터프리터</li>
      <li>코드 조각이나 문장을 입력하면 실시간으로 평가하고 결과를 즉시 표시하는 기능을 제공하여, test 및 새로운 개념을 익히는 데 유용한 도구로 사용될 수 있음</li>
    </ul>
  </div>
</details>
<details markdown="1">
  <summary>Compiler</summary>
  <div>
    <ul>
      <li>소스 코드를 기계 코드로 변환하는 과정, 컴퓨터가 이해할 수 있는 형태로 번역하는 과정</li>
      <li>컴파일러나 어셈블러 등의 도구를 사용하여 이루어지며, 컴퓨터가 직접 실행할 수 있는 기계 코드로의 변환을 통해 프로그램이 동작할 수 있게 됨</li>
    </ul>
  </div>
</details>
<details markdown="1">
  <summary>Syntax</summary>
  <div>
    <ul>
      <li>프로그램에서 지켜야하는 규칙, 문법규칙이나 명명규칙, 보안, 예외처리 등이 있음</li>
    </ul>
  </div>
</details>
<details markdown="1">
  <summary>System.out</summary>
  <div>
    <ul>
      <li>표준 출력 스트림을 나타냄, 콘솔에 정보를 표시하는 데 사용, 주로 디버깅, 테스트, 또는 사용자와의 상호작용을 위해 콘솔에 정보를 표시하는 데 사용됨</li>
    </ul>
  </div>
</details>
<details markdown="1">
  <summary>Variable</summary>
  <div>
    <ul>
      <li>값을 저장하기 위한 local 메모리, 값을 저장하는 메모리의 위치는 컴퓨터의 주 기억장치(메모리)에 할당됨</li>
      <li>이 메모리 위치를 나타내는 주소(address)에 해당하는 위치에 데이터가 저장됨</li>
      <li>값이 메모리에 저장되면 해당 메모리 위치에 대한 주소를 사용하여 그 값을 읽거나 수정할 수 있음</li>
      <li>주 기억 장치는 일반적으로 RAM(Random Access Memory)를 나타내며, 읽고 쓰기가 빠르게 이루어질 수 있는 휘발성 메모리입니다. 값이 저장되어도 전원이 꺼지면 그 값이 사라지기 때문에 휘발성이라고 합니다.</li>
    </ul>
  </div>
</details>
<details markdown="1">
  <summary>Assignment</summary>
  <div>
    <ul>
      <li>변수에 값을 할당하는 것(대입 또는 저장하는 행위), 이는 프로그래밍에서 기본적이고 일반적인 작업임</li>
    </ul>
  </div>
</details>

# Primitive Data Types

<details markdown="1">
  <summary>Primitive Data Type</summary>
  <div>
    <ul>
      <li>Java에서 기본적인 값을 나타내는 여러 내장, 원시 데이터 타입</li>
      <li>다양한 유형의 정보를 저장하고 조작하는 데 기본적으로 사용됨</li>
    </ul>
  </div>
</details>
<details markdown="1">
  <summary>Primitive variables</summary>
  <div>
    <ul>
      <li>원시 변수는 정수, 실수, 참과 같은 기본 데이터 타입의 단일 값을 저장하는 변수를 의미함</li>
      <li>이러한 변수들은 간단한 데이터를 저장하는 데 사용되며 프로그래밍에서의 기본적인 빌딩 블록으로 작용함</li>
      <li>메모리에 직접 값을 저장하므로 참조 변수와는 구별됨</li>
    </ul>
  </div>
</details>
<details markdown="1">
  <summary>Primitive Data Type Examples</summary>
  <div>
    <ul>
      <li>boolean, char, byte, short, int, long, float, double</li>
    </ul>
  </div>
</details>
<details markdown="1">
  <summary>boolean</summary>
  <div>
    <ul>
      <li>true 또는 false를 나타내는 논리값</li>
    </ul>
  </div>
</details>
<details markdown="1">
  <summary>char</summary>
  <div>
    <ul>
      <li>단일 문자를 표현하는 값</li>
    </ul>
  </div>
</details>
<details markdown="1">
  <summary>byte</summary>
  <div>
    <ul>
      <li>8bit 정수를 표현하는 값</li>
    </ul>
  </div>
</details>
<details markdown="1">
  <summary>short</summary>
  <div>
    <ul>
      <li>16bit 정수를 표현하는 값</li>
    </ul>
  </div>
</details>
<details markdown="1">
  <summary>int</summary>
  <div>
    <ul>
      <li>32bit 정수를 표현하는 값</li>
    </ul>
  </div>
</details>
<details markdown="1">
  <summary>long</summary>
  <div>
    <ul>
      <li>64bit 정수를 표현하는 값</li>
    </ul>
  </div>
</details>
<details markdown="1">
  <summary>float</summary>
  <div>
    <ul>
      <li>32bit 부동 소수점 숫자를 표현하는 값, IEEE 754 부동 소수점 표준에 따라 표현됨</li>
    </ul>
  </div>
</details>
<details markdown="1">
  <summary>double</summary>
  <div>
    <ul>
      <li>64bit 부동 소수점 숫자를 표현하는 값, IEEE 754 부동 소수점 표준에 따라 표현됨</li>
    </ul>
  </div>
</details>

# Java ****Fundamentals 2****
<details markdown="1">
  <summary>Method</summary>
  <div>
    <ul>
      <li>특정 작업을 수행하고, 여러 차례 호출될 수 있는 코드 블록</li>
      <li>프로그래밍에서 코드를 구조화하고 재사용성을 높이는 데 사용됨</li>
    </ul>
  </div>
</details>
<details markdown="1">
  <summary>Method Syntax</summary>
  <div>
    <ul>
      <li>
        ```java
        ReturnType methodName(매개변수) {
        // Body
        // 실행하고자 하는 명령문
        }
        ```
      </li>
    </ul>
  </div>
</details>
<details markdown="1">
  <summary>Return Type in Method</summary>
  <div>
    <ul>
      <li>자바 메서드에서 반환하는 값의 데이터 타입을 나타냄, 메서드는 작업을 수행하고 호출한 곳에 결과를 반환할 수 있음, 이때 반환되는 값의 데이터 타입을 ReturnType으로 지정함</li>
    </ul>
  </div>
</details>
<details markdown="1">
  <summary>void</summary>
  <div>
    <ul>
      <li>메서드가 값을 반환하지 않는 경우, 해당 메서드의 반환타입으로 사용, 메서드가 어떤 값을 반환하지 않음을 나타냄</li>
    </ul>
  </div>
</details>
<details markdown="1">
  <summary>Method Arguments</summary>
  <div>
    <ul>
      <li>
        메서드가 호출 시 제공되는 입력은, 메서드에 전달되는 인자 또는 매개변수라고 불림
        메서드가 실행될 때 필요한 정보나 값을 전달하는 데 사용됨
        매개변수는 메서드의 정의에서 선언되며, 메서드를 호출할 때 전달되는 값들(인자)이 해당 매개변수에 매핑됨
        매개변수를 통해 메서드에 입력을 전달함으로써 메서드는 호출된 곳에서 제공된 정보를 활용하여 원하는 작업을 수행할 수 있음
      </li>
    </ul>
  </div>
</details>
<details markdown="1">
  <summary>Class</summary>
  <div>
    <ul>
      <li>자바에서 객체를 생성하는 데 사용되는 설계도</li>
      <li>클래스는 객체의 설계도(틀)이며, 객체는 해당 클래스의 인스턴스임. 클래스는 속성(필드)과 동작(메서드)으로 이루어져 있으며, 이를 통해 객체의 상태와 행동을 정의함</li>
      <li>클래스는 객체를 생성하는 데 필요한 구조와 동작을 정의하는 역할을 함</li>
    </ul>
  </div>
</details>
<details markdown="1">
  <summary>Object</summary>
  <div>
    <ul>
      <li>자바에서 식별성, 동작, 상태를 가진 클래스의 인스턴스를 객체라고 함</li>
      <li>객체는 해당 클래스의 실제 구현체로, 클래스의 설계도에 따라 생성되어 식별성을 가지며 특정 상태와 동작을 가짐</li>
      <li>객체는 메모리에서 실제로 생성되어 프로그램에서 사용되는 개체이며, 객체지향 프로그래밍에서는 객체를 중심으로 시스템을 모델링하고 구현함</li>
    </ul>
  </div>
</details>
<details markdown="1">
  <summary>JVM Java Virtual Machine</summary>
  <div>
    <ul>
      <li>자바 바이트코드를 실행하는 런타임 환경</li>
      <li>자바 프로그램이 여러 플랫폼에서 실행될 수 있도록 하는 핵심 역할을 수행함</li>
      <li>자바 프로그램은 소스코드를 컴파일하여 바이트코드로 변환하고, 이 바이트코드는 JVM에서 실행됨</li>
      <li>자바의 크로스 플랫폼 특성은 JVM 덕분에 가능함. 동일한 바이트코드가 여러 플랫폼에서 동일한 방식으로 실행되므로, 자바 프로그램은 한 번 작성하고 어떤 운영체제나 하드웨어에서든 실행될 수 있음</li>
    </ul>
  </div>
</details>
<details markdown="1">
  <summary>JRE Java Runtime Environment</summary>
  <div>
    <ul>
      <li>자바 실행 환경은 자바 프로그램을 실행하기 위해 필요한 모든 구성 요소를 포함하는 환경을 제공함</li>
      <li>JRE = JVM + Libraries + Other Components</li>
      <li>라이브러리는 다양한 기능을 제공, 이를 활용해 효율적으로 프로그래밍할 수 있게 함</li>
      <li>기타 구성요소엔 자바 프로그램을 실행하는 데 필요한, 네이티브 라이브러리, 실행 환경 설정 파일, 클래스로더 등이 포함될 수 있음</li>
      <li>JRE를 설치하면 사용자는 자바 애플리케이션을 실행할 수 있게 되며, 개발자는 자신의 코드를 누군가에게 배포할 때 해당 사용자가 JRE를 설치하지 않아도 애플리케이션이 동작할 수 있도록 할 수 있음</li>
      <li>JDK는 JRE를 포함하고 있음, 개발자는 JDK를 사용하여 자바 애플리케이션을 개발하고 테스트할 수 있음</li>
    </ul>
  </div>
</details>
<details markdown="1">
  <summary>JDK Java Development Kit</summary>
  <div>
    <ul>
      <li>자바 개발 키트는 자바 프로그램을 개발하고 실행하기 위한 도구 모음을 제공함</li>
      <li>JDK = JRE + Compilers + Debuggers</li>
      <li>JDK를 설치하면 개발자는 자바 애플리케이션을 작성, 컴파일, 디버깅하고 실행할 수 있음</li>
      <li>또한 JDK는 자바 개발에 필요한 모든 도구와 라이브러리를 제공하므로, 개발자는 JDK만 설치하면 모든 필수 도구를 사용할 수 있음</li>
    </ul>
  </div>
</details>
<details markdown="1">
  <summary>Compiler</summary>
  <div>
    <ul>
      <li>자바 소스 코드를 바이트코드로 변환하는 프로그램은 주로 자바 컴파일러임</li>
      <li>소스코드파일(.java)을 컴파일하여 바이트코드 파일(.class)을 생성함, 이 바이트코드 파일은 JVM에서 실행됨</li>
      <li>컴파일 과정
        1. 자바코드 작성
        2. 컴파일: 자바 컴파일러를 사용하여 소스 코드(.java)를 바이트 코드(.class)로 변환
        3. 실행: 생성된 바이트코드 파일(.class)은 JVM에서 실행됨
      </li>
    </ul>
  </div>
</details>
<details markdown="1">
  <summary>IDE Integrated Development Environment</summary>
  <div>
    <ul>
      <li>통합 개발 환경은 소프트웨어 개발을 효율적으로 돕는 도구임, 자바 코드를 효율적으로 개발하고 디버깅하며 관리하기 위한 여러 IDE가 있음</li>
      <li>이러한 IDE는 코드 작성, 디버깅, 프로젝트 관리, 버전 관리 등을 편리하게 할 수 있도록 다양한 기능을 제공</li>
    </ul>
  </div>
</details>
<details markdown="1">
  <summary>Eclipse IDE</summary>
  <div>
    <ul>
      <li>프로그래머가 자바 소프트웨어를 개발하는 데 사용되는 통합 개발 환경 중 하나</li>
    </ul>
  </div>
</details>
<details markdown="1">
  <summary>Debugging</summary>
  <div>
    <ul>
      <li>자바 프로그램에서 오류 또는 버그를 식별하고 수정하는 프로세스</li>
      <li>프로그래머가 작성한 코드에서 발생하는 문제를 찾아내고 해결하는 과정을 의미</li>
      <li>프로그램의 안정성을 향상시키고 원하는 동작을 얻을 수 있도록 도와줌</li>
      <li>프로그램의 품질을 향상시키고 안정성을 보장하는 데 도움이 됨</li>
    </ul>
  </div>
</details>

![image](https://github.com/Min-SungJo/Java-Programing-for-Complete-Beginners/assets/91239439/0e99c6b0-f950-45da-94aa-cb2c2dc54e46)


자바의 플랫폼 독립성은 **바이트코드**와 **플랫폼별 JVM**에서 온다
