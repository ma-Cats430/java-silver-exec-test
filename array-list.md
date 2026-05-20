# Javaコード ArrayList編メモ
## ArrayListの宣言、インスタンス化、初期化
### ❌ コンパイルエラーになるもの
```Java
ArrayList<String> array = new List<>();
ArrayList<String> array = new List<String>();
ArrayList<int> intList = new ArrayList<int>();
```

### ✅ 使用できる正常なもの
```Java
ArrayList<String> array = new ArrayList<>();
List<String> list = new ArrayList<>();
ArrayList<Integer> intList = new ArrayList<>();
```
## ArrayListの特徴
<summary>ArrayListは、要素を追加すると自動的にサイズ（容量）が拡張される。</summary>
<summary>ArrayListは、プリミティブ型を直接格納することはできず、ラッパークラスを使用する必要がある。</summary>
<summary>set(int index, E element)メソッドは、置き換えられる前の古い要素を返す。</summary>
<summary>remove(int index)メソッドは、削除した要素を返す。</summary>

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
### 1. ArrayListと配列に関する記述として、正しいものを2つ選びなさい。
<details><summary>✅ 答え</summary>B, D</details>
