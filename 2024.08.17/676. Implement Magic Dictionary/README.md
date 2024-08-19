# Leetcode 676

判断两个字符串是否仅有一个字符不同。

长度检查：首先检查两个字符串的长度是否相同。如果不同，立即返回 false。
遍历字符：遍历字符串中的每个字符并比较它们：
如果字符不同，并且此前没有发现任何不同的字符，则标记为true，表示已经发现一个不同的字符。
如果再次发现不同字符，并且已经为标记true（即已经发现了一个不同字符），则将其重置为 false，并立即中断循环，因为这说明有超过一个字符不同。

然后逐个遍历即可。