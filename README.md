#RSA Thing


RSA Thing is a small program that performs an RSA encryption algorithm on three given integers, `b`, `n`, and `m`.

https://en.wikipedia.org/wiki/RSA_(cryptosystem)

**Algorithm Example**

```
Choose p = 3 and q = 11
Compute n = p * q = 3 * 11 = 33
Compute φ(n) = (p - 1) * (q - 1) = 2 * 10 = 20
Choose e such that 1 < e < φ(n) and e and n are coprime. Let e = 7
Compute a value for d such that (d * e) % φ(n) = 1. One solution is d = 3 [(3 * 7) % 20 = 1]
Public key is (e, n) => (7, 33)
Private key is (d, n) => (3, 33)
The encryption of m = 2 is c = 27 % 33 = 29
The decryption of c = 29 is m = 293 % 33 = 2
```

**Program Example**

```
Insert an integer (b): 25
Insert another integer(n): 13
Insert another integer(m): 35

Temp: 1
tempWhatever column*********
x: 1
power: 25
tempWhatever: 25

x  column*********
M: 35
x: 25

tempWhatever2 column*********
Power: 25
tempWhatever2: 625

Power column*********
m: 35
Power: 

Count: 1
Restarting now

Temp: 1
tempWhatever column*********
x: 25
power: 30
tempWhatever: 750

x  column*********
M: 35
x: 15

tempWhatever2 column*********
Power: 30
tempWhatever2: 900

Power column*********
m: 35
Power: 

Count: 2
Restarting now

Temp: 0
Count: 3
Restarting now

Temp: 1
tempWhatever column*********
x: 15
power: 25
tempWhatever: 375

x  column*********
M: 35
x: 25

tempWhatever2 column*********
Power: 25
tempWhatever2: 625

Power column*********
m: 35
Power: 

Count: 4
Restarting now
25
```
