class TrieNode {
    Map<String, TrieNode> children;
    boolean isFile;
    StringBuilder content;
    String fileName;

    public TrieNode() {
        children = new HashMap<>();
        isFile = false;
        content = new StringBuilder();
    }
}

class FileSystem {
    TrieNode root;

    public FileSystem() {
        // initialization
        root = new TrieNode();
    }

    public List<String> ls(String path) {
        // if path:
        // 1. is a file path --> return a list only contains this file's name
        // 2.is a directory --> return a list of file and directory names in this
        // directory
        List<String> res = new LinkedList<>();
        TrieNode cur = goToPathFolder(path);
        if (cur.isFile) {
            res.add(cur.fileName);
            return res;
        }
        res.addAll(new ArrayList<>(cur.children.keySet()));
        Collections.sort(res);
        return res;
    }

    public void mkdir(String path) {
        // Makes a new directory according to the given path. The given directory path
        // does not exist.
        // If the middle directories in the path do not exist, you should create them as
        // well.
        // 按照/来分割路径 --> 判断各个路径是否存在 --> 存在就继续
        goToPathFolder(path);
    }

    public void addContentToFile(String filePath, String content) {
        // if filepath:
        // 1.not exist --> 1) create file containing given content
        // 2.exist-->add content to original content
        TrieNode cur = goToPathFolder(filePath);
        cur.isFile = true;
        cur.content.append(content);
    }

    public String readContentFromFile(String filePath) {
        TrieNode cur = goToPathFolder(filePath);
        return cur.content.toString();
    }

    private TrieNode goToPathFolder(String path) {
        TrieNode curr = root;
        String[] folders = path.split("/");
        for (int i = 1; i < folders.length; i++) {
            curr.children.putIfAbsent(folders[i], new TrieNode());
            curr = curr.children.get(folders[i]);
            curr.fileName = folders[i];
        }
        return curr;
    }
}

/**
 * Your FileSystem object will be instantiated and called as such:
 * FileSystem obj = new FileSystem();
 * List<String> param_1 = obj.ls(path);
 * obj.mkdir(path);
 * obj.addContentToFile(filePath,content);
 * String param_4 = obj.readContentFromFile(filePath);
 */