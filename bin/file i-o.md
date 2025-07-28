# File I/O in Java

## Overview
File I/O (Input/Output) in Java allows reading from and writing to files. Java provides several classes in the `java.io` and `java.nio` packages to handle file operations efficiently.

---
## 1. File Class
- The `File` class represents file and directory pathnames.
- Used for checking file properties, creating or deleting files.

### Important Methods:
- `exists()`: Checks if a file exists.
- `createNewFile()`: Creates a new empty file.
- `delete()`: Deletes a file.
- `length()`: Returns file size in bytes.
- `getAbsolutePath()`: Returns the absolute path.
- `isDirectory()`, `isFile()`: Checks type.

---
## 2. Byte Streams (FileInputStream & FileOutputStream)
Used for reading and writing **binary data** (images, audio, etc.).

### Important Classes:
- `FileInputStream`: Reads bytes from a file.
- `FileOutputStream`: Writes bytes to a file.
- `read()`: Reads byte-by-byte.
- `write(byte[])`: Writes byte data.

---
## 3. Character Streams (FileReader & FileWriter)
Used for **text-based files**.

### Important Classes:
- `FileReader`: Reads characters from a file.
- `FileWriter`: Writes characters to a file.
- `read()`: Reads character-by-character.
- `write(String)`: Writes string data.

---
## 4. BufferedReader & BufferedWriter
Used for **efficient file reading/writing** by reducing disk I/O operations.

### Important Classes:
- `BufferedReader`: Reads text efficiently, line-by-line.
- `BufferedWriter`: Writes text efficiently.
- `readLine()`: Reads a line of text.
- `write(String)`: Writes a string.
- `newLine()`: Adds a new line.

---
## 5. RandomAccessFile
Used to read and write at any position in a file.

### Important Methods:
- `seek(long position)`: Moves the file pointer.
- `read()`, `write()`: Read and write operations at a specific position.

---
## 6. Java NIO (New I/O)
- Uses `Path`, `Files`, `ByteBuffer`, `Channels` for high-performance file operations.

### Important Components:
- `Path`: Represents file paths.
- `Files`: Utility class for file operations.
- `ByteBuffer`: Buffers for byte-based file reading.
- `FileChannel`: Provides efficient file handling.

---
## Conclusion
- **Byte Streams**: Read/write **binary files**.
- **Character Streams**: Read/write **text files**.
- **Buffered Streams**: Efficient file reading/writing.
- **RandomAccessFile**: Read/write at specific positions.
- **Java NIO**: Efficient, non-blocking file handling.
