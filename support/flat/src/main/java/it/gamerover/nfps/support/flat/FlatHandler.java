package it.gamerover.nfps.support.flat;

import it.gamerover.nfps.CoreHandler;
import it.gamerover.nfps.support.flat.packet.FlatSoundPacketAdapter;
import it.gamerover.nfps.packet.SoundPacketAdapter;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused") // This class is used from the deploy module into the main class.
public class FlatHandler extends CoreHandler {

    private final FlatSoundPacketAdapter flatSoundPacketAdapter;

    public FlatHandler(@NotNull Plugin plugin) {

        super(plugin);
        flatSoundPacketAdapter = new FlatSoundPacketAdapter(plugin);

    }

    @NotNull
    @Override
    protected SoundPacketAdapter getSoundPacketAdapter() {
        return flatSoundPacketAdapter;
    }

}