# Leetcode 406

有点利用栈的思想，先比height，降序排序,这样子比能够让后续遍历的时候优先拿出height高的。如果height相同，则比较第二个数字，升序排序。

利用LinkedList的add方法能够在特定位置进行插入，将数组插入到我们的linkedlist的位置k上，保证前面的k个数字都比当前数组大。

