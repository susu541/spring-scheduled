# 概要
複数の定期実行メソッドを１つのプロジェクトに実装する方法の備忘録。

# 実行について
- Sample1Runner を実行したい場合
```
$ ./gradlew bootRun --args="--job.id=sample1"
```

- Sample2Runner を実行したい場合
```
$ ./gradlew bootRun --args="--job.id=sample2"
```
