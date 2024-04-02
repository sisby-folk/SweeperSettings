# SweeperSettings

A mod for minesweeper, which is a mod for minecraft.

Implements two configuration options via `sweepersettings.toml`:

 - `areaSize`: How large the play area is, in powers of two. Default 10 (1024). Game is playable between 5 and 11 - walk up and left to reach the play area on lower values.
 - `speedCap`: How fast the player can move. Default is 6.0. Above 16.0 or so, the player can clip through tiles with sufficient runway.
