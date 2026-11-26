# Difference Between Arrays and ArrayLists

## CSC262 — Discussion 3: Jordan Sneaker Collection

An array allows programmers to store multiple elements of the same data type. Arrays have a fixed length, meaning their values can be replaced, but the original array cannot grow or shrink; this is useful when you know the exact size of whatever information you're assigning (Horstmann, 2017).

For my project, I used my interest in Jordan sneakers. I created an integer array containing Jordan models 1, 3, 4, and 12. I used a for loop to display my collection and the length field to count my pairs. I replaced my Jordan 12s with Jordan 8s without changing the total number of pairs.

An ArrayList is more flexible because it allows elements to be added and removed dynamically. I demonstrated this by purchasing Jordan 11s using add() and selling Jordan 3s using remove(). I also used get() to retrieve an individual model and size() to count my collection.

## Key Differences

| Array | ArrayList |
|---|---|
| Fixed length | Dynamic size |
| Square bracket indexing | get() method |
| length field | size() method |
| Supports primitive types | Stores objects, such as Integer |

## Conclusion

I would use an array when I know the number of elements will remain fixed. However, I would use an ArrayList for a sneaker collection because I can add and remove pairs as my collection changes.

## Reference

Horstmann, C. S. (2017). *Big Java: Late objects, enhanced eText* (2nd ed.). Wiley.
