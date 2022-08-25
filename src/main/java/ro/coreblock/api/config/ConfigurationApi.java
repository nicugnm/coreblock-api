package ro.coreblock.api.config;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;

public interface ConfigurationApi<T extends JavaPlugin> {

    List<ObjectConfiguration> handleConfiguration(T loadingCore);
}
