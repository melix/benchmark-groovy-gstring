# Benchmark GString in Groovy

This project is a benchmark checking the performance of Groovy's GString an alternatives.

Currently it compares:

   - `+` style concatenation
   - `GString` style interpolation
   - usage of `StringBuilder` instead

and tests with both dynamic and static Groovy versions.

# Results

Raw results

```
Benchmark                          Mode  Cnt        Score        Error  Units
StringConcat.gstring              thrpt   20  1623731.208 ±  59007.168  ops/s
StringConcat.gstringStatic        thrpt   20  1606414.896 ±  25461.152  ops/s
StringConcat.simple               thrpt   20  1500527.858 ±  11344.617  ops/s
StringConcat.simpleStatic         thrpt   20  1374998.800 ±  42602.172  ops/s
StringConcat.stringBuilder        thrpt   20  5061006.225 ± 223317.988  ops/s
StringConcat.stringBuilderStatic  thrpt   20  7813080.536 ± 180546.293  ops/s
```

