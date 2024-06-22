package cn.halo;

import cn.hutool.core.io.resource.ResourceUtil;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author yangdh
 * @Descrition Audio
 * @date 2022/12/4 15:25
 */
public class Audio {
    private static InputStream is;
    private Player player;
    ExecutorService service = Executors.newCachedThreadPool();

    public Audio(String path) {
        is = ResourceUtil.getStream(path);
        try {
            player = new Player(is);
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        service.submit(() -> {
            try {
                player.play();
            } catch (JavaLayerException e) {

            }
        });

    }
}
