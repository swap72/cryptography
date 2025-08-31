# `xy + yx = mm`

We interpret:

- `xy` = two-digit number with digits `x` and `y`
- `yx` = two-digit number with digits `y` and `x`
- `mm` = two-digit number with equal digits

---

## Step 1: Simplification
\[
(10x+y) + (10y+x) = 11(x+y) = 11m \quad\Rightarrow\quad m = x+y
\]

---

## Step 2: Constraints
- \(1 \leq x, y \leq 9\) (two-digit numbers can’t start with 0)
- \(1 \leq m \leq 9\) (since `mm` is a two-digit number with repeated digit)
- \(x+y = m \leq 9\)
- Additional conditions:
  - \(x \neq y\)
  - \(x \neq m\)
  - \(y \neq m\)

---

## Step 3: All Solutions \((x,y,m)\)
There are **32 ordered triples**:

```
(1,2,3) (1,3,4) (1,4,5) (1,5,6) (1,6,7) (1,7,8) (1,8,9)
(2,1,3) (2,3,5) (2,4,6) (2,5,7) (2,6,8) (2,7,9)
(3,1,4) (3,2,5) (3,4,7) (3,5,8) (3,6,9)
(4,1,5) (4,2,6) (4,3,7) (4,5,9)
(5,1,6) (5,2,7) (5,3,8) (5,4,9)
(6,1,7) (6,2,8) (6,3,9)
(7,1,8) (7,2,9)
(8,1,9)
```


---

✅ Example:
- \((x,y,m) = (2,7,9)\) works because:
  - \(27 + 72 = 99\)
  - \(m = 9\), which matches \(x+y = 2+7 = 9\).

---

