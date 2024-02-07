package HackerRank;

import java.util.List;

public class DesignerPDFPreview {
    public static void main(String[] args) {
        List<Integer> h = List.of(1, 3, 1, 3, 1, 4, 1, 3, 2);
        String word = "abc";
        System.out.println(designerPdfViewer(h, word));
    }

    public static int designerPdfViewer(List<Integer> h, String word) {
        int maxHeight = 0;
        for (int i = 0; i < word.length(); i++) {
            int height = h.get(word.charAt(i) - 'a');
            if (height > maxHeight) {
                maxHeight = height;
            }
        }
        return maxHeight * word.length();
    }
}
