# Javaコード 配列編メモ
## 配列の宣言、インスタンス化、初期化
### ❌ コンパイルエラーになるもの
```Java
// 部屋数をいくつ確保したらいいかわからないため
int[] array;
array = {10, 20, 30};

int[] a = new int[2]{1, 2};
int[] b = new int[];
int c[5] = new int[5];
int d[3];

var e = {1, 2};
var[] f = new int[3];

String[] bomp;
bomp = {"イアス", "ガブットボンプ"};
```

### ✅ 使用できる正常なもの
```Java
int[] a;
int b[];
int[] c[]; // 2次元配列

int[] d = new int[]{1, 2};

var var = new int[5];
var e = new int[]{1, 2};

int[] f;
f = new int[]{1, 2};

String[] bomp = {"イアス", "ガブットボンプ"};

String[] fruits;
fruits = new String[]{"イアス", "ガブットボンプ"};
```

## 配列の中身、初期値
### {null, null, null}
```Java
String[] strArray = new String[3];
```
### {0, 0, 0}
```Java
int[] intArray = new int[3];
```

## プログラム実行結果問題
### 1. 以下のプログラムをコンパイルしたときの結果として正しいものを1つ選びなさい。
<details><summary>✅ 答え</summary>C. コンパイルエラーが発生する</details>

```Java
public class Main {
    public static void main(String[] args) {
        int[] array;
        array = {10, 20, 30};
        System.out.println(array[0]);
    }
}

/*
A. 10
B. 0
C. コンパイルエラーが発生する
D. 実行時に例外がスローされる
*/
```

### 2. 以下のプログラムをコンパイル、実行したときの結果として正しいものを1つ選びなさい。
<details><summary>✅ 答え</summary>C. 4</details>

```Java
public class Main {
    public static void main(String[] args) {
        int[][] array = new int[2][];
        array[0] = new int[]{1, 2};
        array[1] = new int[]{3, 4, 5};
        System.out.println(array[1][1]);
    }
}

/*
A. 2
B. 3
C. 4
D. 5
E. コンパイルエラーが発生する
F. 実行時にNullPointerExceptionがスローされる
*/
```

### 3. 以下のプログラムをコンパイル、実行したときの結果として正しいものを1つ選びなさい。
<details><summary>✅ 答え</summary>C. 9,9</details>

```Java
public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = a;
        b[1] = 9;
        System.out.println(a[1] + "," + b[1]);
    }
}

/*	
A. 2,2
B. 2,9
C. 9,9
D. 9,2
*/
```

### 4. 以下のプログラムをコンパイル、実行したときの結果として正しいものを1つ選びなさい。
<details><summary>✅ 答え</summary>B. null</details>

```Java
public class Main {
    public static void main(String[] args) {
        String[][] array = new String[2][2];
        System.out.println(array[0][0]);
    }
}

/*
A. "" (空文字)
B. null
C. コンパイルエラーが発生する
D. 実行時にArrayIndexOutOfBoundsExceptionがスローされる
*/
```

### 5. 以下のプログラムをコンパイル、実行したときの結果として正しいものを1つ選びなさい。
<details><summary>✅ 答え</summary>B. false</details>

```Java
public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        System.out.println(a.equals(b));
    }
}

/*
A. true
B. false
C. 0
D. 1
E. コンパイルエラーが発生する
F. 実行時にIllegalArgumentExceptionがスローされる
*/
```

### 6. 以下のプログラムをコンパイル、実行したときの結果として正しいものを1つ選びなさい。
<details><summary>✅ 答え</summary>D. 実行時にArrayStoreExceptionがスローされる</details>

```Java
public class Main {
    public static void main(String[] args) {
        Object[] array = new String[3];
        array[0] = "Java";
        array[1] = new StringBuilder("SE");
        System.out.println(array[1]);
    }
}

/*
A. SE
B. Java
C. コンパイルエラーが発生する
D. 実行時にArrayStoreExceptionがスローされる
E. 実行時にClassCastExceptionがスローされる
*/
```


### 7. 以下のプログラムをコンパイル、実行したときの結果として正しいものを1つ選びなさい。
<details><summary>✅ 答え</summary>E. array = new int[]{40, 50, 60};の行でコンパイルエラーが発生する</details>

```Java
public class Main {
    public static void main(String[] args) {
        final int[] array = {10, 20, 30};
        array[0] = 100;
        array = new int[]{40, 50, 60};
        System.out.println(array[0]);
    }
}

/*
A. 10
B. 100
C. 40
D. array[0] = 100;の行でコンパイルエラーが発生する
E. array = new int[]{40, 50, 60};の行でコンパイルエラーが発生する
*/
```
