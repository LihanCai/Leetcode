# Leetcode 2028

题目解读：总共扔了n + m次骰子，n次的数据缺失了，给你平均数和数字n，返回任意一个能够让n个数据和m个数据的平均数为给定的平均数的数组。

我的做法是先反向把和计算出来，再计算缺了多少，然后用double类型的数据来计算缺了的数字的平均值，若avg>6或者avg<1说明不能够实现（因为骰子只能取1到6），直接返回空数组即可。接下来是数学题，判断剩余值%n的结果rest是否为0，rest为0说明能直接完美分配，否则前面rest个数每个数多分配1，剩下的数直接分配avg的取整版即可。