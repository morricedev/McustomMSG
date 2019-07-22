package me.morrice.eventos;

import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.entity.Player;
import static me.morrice.MCustomMsg.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerEventos implements Listener {

    //AVISO QUANDO ENTRAR
    @EventHandler
    public void Entrar(PlayerJoinEvent e){
        Player p = e.getPlayer();
        e.setJoinMessage(getInstance().getConfig().getString("Config.Entrar") + p.getName());
    }

    //AVISO QUANDO SAIR
    @EventHandler
    public void Sair(PlayerQuitEvent e){
        Player p = e.getPlayer();
        e.setQuitMessage(getInstance().getConfig().getString("Config.Sair")+ p.getName());
    }

    //MENSAGENS ENVIADAS PARA O PLAYER
    @EventHandler
    public void Mensagem(PlayerJoinEvent e){
        Player p = e.getPlayer();
        p.sendMessage(getInstance().getConfig().getString("Config.Mensagem"));

        //ACTION BAR
        p.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent(getInstance().getConfig().getString("Config.ActionBar")));
    }
}
