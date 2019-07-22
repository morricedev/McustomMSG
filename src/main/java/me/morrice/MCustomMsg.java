package me.morrice;

import me.morrice.eventos.PlayerEventos;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class MCustomMsg extends JavaPlugin {

private static MCustomMsg instance;

    @Override
    //QUANDO LIGAR
    public void onEnable() {
        instance = this;
        CarregarConfig();
        Bukkit.getConsoleSender().sendMessage("§3[McustomMsg]: §aHABILITADO!");
        Bukkit.getConsoleSender().sendMessage("§3Plugin desenvolvido por: §aDev Morrice");

        Registrareventos();
    }

    //QUANDO DESLIGAR
    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("§3[McustomMSG]: §cDESABILITADO!");

    }

    //CARREGA A CONFIGURAÇÃO
    private void CarregarConfig() {
    getConfig().options().copyDefaults(false);
    saveDefaultConfig();
    }

    //REGISTRA OS EVENTOS
    private void Registrareventos() {
    Bukkit.getPluginManager().registerEvents(new PlayerEventos(), this);
    }

    //INSTANCIA PARA PUXAR EM OUTRAS CLASSES
    public static MCustomMsg getInstance(){
        return instance;
    }

}

