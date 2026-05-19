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
