# MaquinaSnacks Project

## Packages
- `maquina_snacks`

## Classes
- **MaquinaSnacks**
  - **Methods**
    - `main(String[] args)`
    - `maquinaSnacks()`
    - `mostrarMenu(Scanner consola)`
    - `ejecutarOpciones(int opcion, Scanner consola, List<Snack> productos)`
    - `comprarSnack(Scanner consola, List<Snack> productos)`
    - `mostrarTicket(List<Snack> productos)`
    - `agregarSnack(Scanner consola)`

- **Snack**
  - **Fields**
    - `contadorSnacks` (static)
    - `idSnack`
    - `nombre`
    - `precio`
  - **Constructors**
    - `Snack()`
    - `Snack(String nombre, double precio)`
  - **Methods**
    - `getContadorSnacks()`
    - `getIdSnack()`
    - `getNombre()`
    - `setNombre(String nombre)`
    - `getPrecio()`
    - `setPrecio(double precio)`
    - `toString()`
    - `equals(Object o)`
    - `hashCode()`

- **Snacks**
  - **Fields**
    - `snacks` (static final)
  - **Static Initializer Block**
    - Initializes `snacks` with default snacks
  - **Methods**
    - `agregarSnack(Snack snack)`
    - `mostrarSnacks()`
    - `getSnacks()`

## Relationships
- **MaquinaSnacks** uses **Snack** and **Snacks** to manage and display snacks.
- **Snacks** contains a list of **Snack** objects.
- **Snack** is a serializable class representing individual snacks with unique IDs.

## Functionality
- **MaquinaSnacks**
  - Provides a menu-driven interface for:
    - Buying snacks
    - Displaying a ticket of purchased snacks
    - Adding new snacks to the inventory
    - Exiting the program
- **Snack**
  - Represents a snack with an ID, name, and price.
  - Includes methods for getting and setting snack details.
- **Snacks**
  - Manages a static list of snacks.
  - Provides methods to add snacks, display the inventory, and retrieve the list of snacks.
