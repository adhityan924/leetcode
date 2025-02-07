public class Codec {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder encBuilder = new StringBuilder();
        for (String str : strs) {
            encBuilder.append(str.length()).append(":").append(str);
        }
        return new String(encBuilder);
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        int endIndex = 0;
        List<String> result = new ArrayList<>();

        while (endIndex != s.length()) {
            int colonIndex = s.indexOf(":", endIndex);
            int wordLength = Integer.parseInt(s.substring(endIndex,colonIndex));
            endIndex = colonIndex + 1 + wordLength;
            result.add(s.substring(colonIndex + 1, endIndex));
        }
        return result;
    }

}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));