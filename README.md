# [Confitura 2015](http://tech.viacom.com/warsawsdc/confitura2015/)

## Solution
This is probably simplest and fastests solution to Superdigit problem, written in Java.

## How to build

```
$ mvn clean install
```

## How to run

```
$ java -jar superdigit.jar 6 7 201
superdigit(6) = 6
superdigit(7) = 7
superdigit(2015) = 8
```


## Superdigit

We define superdigit of an integer x using the following rules:

* If x has only 1 digit, then its superdigit is x.
* Otherwise, the superdigit of x is equal to the superdigit of the digit-sum of x. Here, digit-sum of a number is defined as the sum of its digits.

For example, super digit of 98741 will be calculated as:

```
super-digit(98741) = super-digit(9+8+7+4+1)
                  = super-digit(29)
                  = super-digit(2+9)
                  = super-digit(11)
                  = super-digit(1+1)
                  = super-digit(2)
                  = 2.
```

You can check contest bye-laws [here](http://tech.viacom.com/warsawsdc/confitura2015/Regulamin_konkurs_Viacom_programmer_adventure_2015.pdf).

Check out our Confitura 2015 site [here](http://tech.viacom.com/warsawsdc/confitura2015/)

We are hiring! Visit our [career site](http://tech.viacom.com/careers/).
