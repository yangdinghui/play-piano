package cn.halo.test;

import cn.halo.Animation;
import cn.halo.AudioPlay;
import org.junit.Test;

import java.io.File;

/**
 * @author yangdh
 * @Descrition 类描述PlayTest信息
 * @date 2022/12/4 15:30
 */
public class PlayTest {

    @Test
    public void play() {
        String path =
                new File("").getAbsolutePath() + File.separator + "src/main/resources/notes" + File.separator;
        String notes =
                " 7-  1   2   3   0   5-  5   3   0   0   0   0   0   0   0   0 \n" +
                        " 7-  1   2   3   0   5-  5   3   2   3   1   2   7-  1   5-  0 \n" +
                        " 7-  1   2   3   0   5-  5   3   0   0   0   0   0   0   0   0 \n" +
                        " 7-  1   2   3   0   5-  5   3   2   3   1   2   7-  1   5-  0 \n" +
                        " 7   1+  2+  3+  0   5   5+  3+  0   0   0   0   0   0   0   0 \n" +
                        " 7   1+  2+  3+  0   5   5+  3+  2+  3+  1+  2+  7   1+  5   0 \n" +
                        " 7   1+  2+  3+  0   5   5+  3+  0   0   0   0   0   0   0   0 \n" +
                        " 2   0   0   0   0   0   0   0   1   0   0   0   0   0   0   0 \n" +

                        " 2   0   0   1   2   0   0   1   2   0   3   0   5   0   3   0   \n" +
                        " 2   0   0   1   2   0   0   1   2   3   2   1   6-  0   0   0   \n" +
                        " 2   0   0   1   2   0   0   1   2   0   3   0   5   0   3   0   \n" +
                        " 2   0   0   3   2   0   1   2   2   0   0   0   0   0   0   0   \n" +
                        " 2   0   0   1   2   0   0   1   2   0   3   0   5   0   3   0   \n" +
                        " 2   0   0   3   2   0   1   0   6-  0   0   0   \n" +
                        " 3   2   1   2   1   0   0   0   \n" +
                        " 3   2   1   2   1   0   0   \n" +
                        " 5-  3   2   1   2   0   0   1   0   0   0   0   0   \n" +
                        " 1   0   2   0   3   0   1   0   6   0   5   6   0   0   0   \n" +
                        " 2   7   0   6   7   0   0   0   0   \n" +
                        " 7   0   6   7   0   0   3   0   1+  2+  1+  7   6   0   0   \n" +
                        " 5   6   0   5   6   0   5   6   5   6   0   5   1   0   5   0   3   3   0   0   0   0   0   0   0   \n" +
                        " 1   0   2   0   3   0   1   0   6   0   5   6   0   0   0   \n" +
                        " 2   7   0   6   7   0   0   0   0   \n" +
                        " 7   0   6   7   0   0   3   0   1+  2+  1+  7   6   0   0   \n" +
                        " 5   6   0   3+  3+  0   0   5   0   6   0   3+  3+  0   \n" +
                        " 5   0   6   6   0   3-  0   3-  0   3-  0   3-  0   0   0   \n" +
                        " 1+  0   2+  0   3+  0   6+  5+  0   0   6+  5+  0   0   6+  5+  0   2+  0   0   \n" +
                        " 3+  0   6+  5+  0   0   6+  5+  0   0   6+  5+  0   3+  0   0   \n" +
                        " 2+  0   1+  6   0   1+  0   1+  2+  0   1+  6   0   0   1+  0   3+  0   0   0   0   0   3+  0   2+  0   0   0   \n" +
                        " 1+  0   2+  0   3+  0   6+  5+  0   0   6+  5+  0   0   6+  5+  0   0   \n" +
                        " 2+  0   3+  0   6+  5+  0   0   6+  5+  0   0   6+  5+  0   0   \n" +
                        " 3+  0   2+  0   1+  6   0   0   3+  0   2+  0   1+  \n" +
                        " 6   0   1+  0   0   1+  0   0   0   0   0   0   0   0   0   0   0   \n" +
                        " 6   3+  0   0   2+  0   1+  6   0   3+  0   0   2+  0   1+  \n" +
                        " 6   0   1+  0   0   1+  0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   \n" +
                        " 7   1+  2+  3+  0   5   5+  3+  2+  3+  7   1+  6   7   5   0   \n" +
                        " 7   1+  2+  3+  0   5   5+  3+  0   0   0   0   0   0   0   0   \n" +
                        " 6+  3+  2+  6   3   6   2+  3+  6+  0   0   0   0   0   0   0 \n ";

        String accompaniments =
                "  4-- 0   1-  0   3-  0   0   0   5-- 0   7-- 0   2-  0   0   0 \n" +
                        " 3-- 0   7-- 0   2-  0   0   0   6-- 0   1-  0   3-  0   0   0 \n" +
                        " 4-- 0   1-  0   3-  0   0   0   5-- 0   7-- 0   2-  0   0   0 \n" +
                        " 3-- 0   7-- 0   2-  0   0   0   6-- 0   1-  0   3-  0   0   0 \n" +
                        " 4-  0   1-  0   3-  0   0   0   5-- 0   7-- 0   2-  0   0   0  \n" +
                        " 3-- 0   7-- 0   2-  0   0   0   6-- 0   1-  0   3-  0   0   0  \n" +
                        " 4-- 0   1-  0   3-  0   0   0   5-- 0   7-- 0   2-  0   0   0  \n" +
                        " 3-  0   0   0   0   0   0   0   1-  0   0   0   0   0   0   0  \n " +

                        "1-- 0   0   0   3-  0   0   0   3-  0   0   0   3-  0   0   0   \n" +
                        " 7-- 0   0   0   2-  0   0   0   2-  0   0   0   2-  0   0   0   \n" +
                        " 7-- 0   0   0   2-  0   0   0   2-  0   0   0   2-  0   0   0   4-- \n" +
                        " 0   0   0   4-  0   0   0   4-  0   0   0   4-  0   0   0 \n " +
                        " 2-- 0   0   0   2-  0   0   0   5-- 0   0   0   2-  0   0   0   6-- 0   0   0   3-  0   0   0   6-- 0   0   0   \n" +
                        " 0   0   0   0   4-- 0   0   0   \n" +
                        " 0   0   0   0   4-  0   0   \n" +
                        " 0   0   0   0   0   1-- 0   5-- 0   1-  0   3-  0   \n" +
                        " 1   0   0   0   1-  0   0   0   4-- 1-  4-  6-  1   0   4-  \n" +
                        " 0   5-- 2-  5-  7-  2   0   5-  0   \n" +
                        " 3-- 7-- 3-  5-  7-  0   0   0   6-- 3-  6-  3-  1   0   0   \n" +
                        " 0   4-- 1-  4-  6-  1   0   4-  0   5-- 2-  5-  7-  2-  0   5-  0   1-- 5-- 1-  3-  5-  0   3-  0   \n" +
                        " 1   0   0   0   5-  0   0   0   4-- 1-  4-  1-  6-  0   1-  \n" +
                        " 0   5-- 2-  5-  2-  7-  0   2-  0   \n" +
                        " 3-- 7-- 3-  5-  7-  0   3-  0   6-- 3-  6-  3-  1   0   3-  \n" +
                        " 0   4-- 1-  4-  6-  3   0   4-  0   5-- 2-  5-  7-  2   0   \n" +
                        " 5-  0   6-- 0   6-- 0   6-- 0   6-- 0   6-- 0   0   0   \n" +
                        " 0   0   0   0   4-- 0   1-  0   4-  0   0   0   5-- 0   2-  0   5-  0   0   0   \n" +
                        " 3-- 0   7-- 0   3-  0   0   0   6-- 0   3-  0   6-  0   0   0   \n" +
                        " 4-- 0   1-  0   4-  0   0   0   5-- 0   2-  0   5-  0   0   0   \n" +
                        " 1-  0   5-  0   1   0   0   0   3-  0   7-  0   \n" +
                        " 3   0   0   0   4-- 0   1-  0   4-  0   0   0   5-- 0   2-  0   5-  0   0   \n" +
                        " 0   3-- 0   7-- 0   3-  0   0   0   6-- 0   3-  0   6-  0   \n" +
                        " 0   0   4-- 0   1-  0   4-  0   0   0   5-- 0   2-  0   5-  0   0   \n" +
                        " 0   1-  0   5-  0   1   0   5-  0   3-  0   0   0   \n" +
                        " 0   0   0   0   4-- 0   0   0   0   0   0   0   5-- 0   0   0   0   0   0   0   \n" +
                        " 4-- 0   1-  0   6-  0   1-  0   5-- 0   2-  0   5-  0   2-  0   \n" +
                        " 3-- 0   7-- 0   5-  0   7-- 0   6-- 0   3-  0   1   0   3-  0   \n" +
                        " 4-- 0   1-  0   6-  0   1-  0   5-- 0   2-  0   7-  0   2-  0   \n" +
                        " 6-- 0   3-  0   6-  0   3-  0   1   0   0   0   3-  0   0   0 \n ";
        String note1 =

                "" +
                        "   2   0   0   1   2   0   0   1   2   0   3   0   5   0   3   0  \n" +
                        " 2   0   0   1   2   0   0   1   2   3   2   1   5-  0   0   0 \n" +
                        " 2   0   0   1   2   0   0   1   2   0   3   0   5   0   3   0 \n" +
                        " 2   0   0   3   2   0   1   0   2   0   0   0   0   0   0   0 \n" +
                        " 2   0   0   1   2   0   0   1   2   0   3   0   5   0   3   0  \n" +
                        " 2   0   0   3   2   0   1   0   6-  0   0   0   3   2   1   2 \n" +
                        " 1   0   0   0   3   2   1   2   1   0   0   5-  3   2   1   2 \n" +
                        " 1   0   0   0   0   0   0   0   1   0   2   0   3   0   1   0 \n" +
                        " 6   0   5   6   0   0   0   1   7   0   6   7   0   0   0   0 \n" +
                        " 7   0   6   7   0   0   3   0   1+  2+  1+  7   6   0   5   0 \n" +
                        " 6   0   5   6   0   5   6   5   6   0   5   2   0   5   0   0 \n" +
                        " 3   0   0   0   0   0   0   0   1   0   2   0   3   0   1   0 \n" +
                        " 6   0   5   6   0   0   0   1   7   0   6   7   0   0   0   0 \n" +
                        " 7   0   6   7   0   0   3   0   1+  2+  1+  7   6   0   5   0 \n" +
                        " 6   0   3+  3+  0   0   5   0   6   0   3+  3+  0   5   0   6 \n" +
                        " 6   0   0   0   0   0   0   0   0   0   0   0   1+  0   2+  0 \n" +
                        " 3+  0   6+  5+  0   0   6+  5+  0   0   6+  5+  0   0   2+  3+ \n" +
                        " 0   0   6+  5+  0   0   6+  5+  0   0   6+  5+  0   3+  0   0 \n" +
                        " 2+  0   1+  6   0   1+  0   0   2+  0   1+  6   0   1+  0   0 \n" +
                        " 3+  0   0   0   0   4+  3+  0   3+  2+  0   0   1+  0   2+  0 \n" +
                        " 3+  0   6+  5+  0   0   6+  5+  0   0   6+  5+  0   0   2+  0  \n" +
                        " 3+  0   6+  5+  0   0   6+  5+  0   0   6+  5+  0   3+  0   0 \n" +
                        " 2+  0   1+  6   0   3+  0   0   2+  0   1+  6   0   1+  0   0 \n" +
                        " 1+  0   0   0   0   0   0   0   0   0   0   0   6   3+  0   0 \n" +
                        " 2+  0   0   0   1+  0   6   0   0   0   3+  0   0   0   0   0 \n" +
                        " 2+  0   0   0   1+  0   6   0   0   0   1+  0   0   0   0   0 \n" +
                        " 1+  0   0   0   0   0   0   0   0   0   0   0   0   0   0   0 \n" +
                        " 0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0  \n";
        String accompaniments1 =
                "   1-- 0   0   0   3-  0   0   0   3-  0   0   0   3-  0   0   0   \n" +
                        " 7-- 0   0   0   2-  0   0   0   2-  0   0   0   2-  0   0   0   \n" +
                        " 7-- 0   0   0   2-  0   0   0   2-  0   0   0   2-  0   0   0   \n" +
                        " 4-- 0   0   0   4-  0   0   0   4-  0   0   0   4-  0   0   0 \n" +
                        " 2-- 0   0   0   2-  0   0   0   5-- 0   0   0   2-  0   0   0 \n" +
                        " 6-- 0   0   0   3-  0   0   0   6-- 0   0   0   0   0   0   0 \n" +
                        " 4-- 0   0   0   0   0   0   0   5-- 0   0   0   0   0   0   0 \n" +
                        " 1-  0   0   0   0   0   0   0   1-  0   0   0   0   0   0   0 \n" +
                        " 4-- 0   0   0   0   0   0   0   5-- 0   0   0   0   0   0   0 \n" +
                        " 3-- 0   0   0   0   0   0   0   6-- 0   0   0   0   0   0   0 \n" +
                        " 4-- 0   0   0   0   0   0   0   5-- 0   0   0   0   0   0   0 \n" +
                        " 1-  0   0   0   0   0   0   0   1-  0   0   0   0   0   0   0 \n" +
                        " 4-- 0   0   0   0   0   0   0   5-- 0   0   0   0   0   0   0 \n" +
                        " 3-- 0   0   0   0   0   0   0   6-- 0   0   0   0   0   0   0 \n" +
                        " 4-- 0   0   0   0   0   0   0   5-- 0   0   0   0   0   0   0 \n" +
                        " 6-- 0   0   0   3-  0   0   0   6-  0   0   0   0   0   0   0 \n" +
                        " 4-- 0   0   0   4-  0   0   0   5-- 0   0   0   5-  0   0   0 \n" +
                        " 3-- 0   0   0   3-  0   0   0   6-- 0   0   0   6-  0   0   0 \n" +
                        " 4-- 0   0   0   4-  0   0   0   5-- 0   0   0   5-  0   0   0 \n" +
                        " 1-- 0   0   0   1-  0   0   0   3-- 0   0   0   3-  0   0   0 \n" +
                        " 4-- 0   0   0   4-  0   0   0   5-- 0   0   0   5-  0   0   0 \n" +
                        " 3-- 0   0   0   3-  0   0   0   6-- 0   0   0   6-  0   0   0 \n" +
                        " 4-- 0   0   0   4-  0   0   0   5-- 0   0   0   5-  0   0   0 \n" +
                        " 6-- 0   0   0   3-  0   0   0   6-- 0   0   0   0   0   0   0  \n" +
                        " 4-- 0   0   0   0   0   0   0   0   0   0   0   0   0   0   0 \n" +
                        " 5-- 0   0   0   0   0   0   0   0   0   0   0   0   0   0   0 \n" +
                        " 0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0 \n" +
                        " 0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   0   ";

        new AudioPlay(180).loadNotes(notes + note1).start();
        new AudioPlay(180).loadNotes(accompaniments + accompaniments1).start();
        new Animation(180).loadNotes(notes + note1).start();
    }
}
