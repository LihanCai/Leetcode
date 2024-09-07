# Leetcode 588

题目解读：一道设计题目，设计一个文件存储系统。

关键是数据结构的选择，把文件系统考虑成一个n叉树或者字典树的数据结构。简单一些的话，可以直接写一个file类，然后来套娃，将其目录下的所有文件都放在一个哈希表中。

设计好file类数据结构。

class File {
    boolean isFile = false;
    StringBuilder content = new StringBuilder();;
    String fileName = "";
    HashMap<String, File> children = new HashMap<>();
}

ls()函数，判断是文件夹还是文件，文件夹就返回全部内容，文件就返回文件名。

mkdir()函数，要判断该目录是否存在，若有任何中间的文件夹是不存在的也要一并创建文件夹。用putIfAbsent()来实现。

addContentToFile()函数，是关键，我们不管之前存储的内容，是用这个函数来标记某个文件夹变成有内容的文件的！然后直接拼接content即可。