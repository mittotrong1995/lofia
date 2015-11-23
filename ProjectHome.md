This is a Java implementation of the LoFIA algorithm.

Based on the compact data structure FP-tree in FP-growth algorithm, LoFIA is proposed to employ bottom-up and depth-first approach to quickly identify the longest frequent schemas from dense data.

It is worth noting that support (frequency) counting for all frequent itemsets with prefix s is computed through the compact data structure FP-tree, instead of having to scan through the entire large dataset.

The speed-up in the performance of LoFIA is achieved by incorporating the proposed pruning criteria of mining for longest frequent itemsets in order to avoid processing branches which are already known to contain only short frequent schemas.