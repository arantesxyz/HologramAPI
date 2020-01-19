# HologramAPI

## Disclaimer

I ([ArantesXYZ](https://github.com/arantesxyz)) did not created this API, this is a forked version which i will maintain.

**If you're looking for the original version, follow the fork link.**

## About

Compared to other Hologram APIs (like [HolographicDisplays](https://github.com/filoghost/HolographicDisplays)) it is more lightweight because it uses Reflection and only sends the packets instead of extending the NMS classes.

This API also allows you to directly attach holograms to players and entities, so they are "riding" on it to remove any need for constantly teleporting the hologram.

**Depends on [PacketListenerAPI](https://github.com/InventivetalentDev/PacketListenerAPI) (If you want touchable holograms or per-player hologram contents)**
**Note: Please use version 3.4.4 or lower**

1.9/1.10 Compatibility with [ProtocolSupport](https://github.com/ProtocolSupport/ProtocolSupport) is not tested yet.

## Getting your version

You'll need maven to compile, or you can simple download a release [here](https://github.com/arantesxyz/HologramAPI/releases).

```bash
mvn clean package
```

## Usage

```java
final Hologram hologram = HologramAPI.createHologram(location, "I'm a hologram. Hey %%player%%!");

hologram.addViewHandler(new ViewHandler() {
    @Override
    public String onView(Hologram hologram, Player player, String string) {
        return string.replace("%%player%%", player.getName());
    }
});

hologram.setTouchable(true);

hologram.addTouchHandler(new TouchHandler() {
    @Override
    public void onTouch(Hologram hologram, Player player, TouchAction action) {
        player.sendMessage("You touched the Hologram! Your action: " + action);
    }
});

hologram.spawn();
```

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License

Soon
