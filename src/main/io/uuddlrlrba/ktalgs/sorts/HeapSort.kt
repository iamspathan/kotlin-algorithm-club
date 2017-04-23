package io.uuddlrlrba.ktalgs.sorts

import io.uuddlrlrba.ktalgs.datastructures.PriorityQueue

/**
 * Heap sort is a comparison based sorting technique based on Binary Heap data structure. It is similar to selection
 * sort where we first find the maximum element and place the maximum element at the end. We repeat the same process
 * for remaining element.
 */
@ComparisonSort
@UnstableSort
class HeapSort : AbstractSortStrategy() {
    override fun <T : Comparable<T>> perform(arr: Array<T>) {
        for (k in arr.size / 2 downTo 1) {
            PriorityQueue.sink(arr as Array<T?>, k, arr.size)
        }
        for (k in arr.size downTo 1) {
            exch(arr, 0, k - 1)
            PriorityQueue.sink(arr as Array<T?>, 1, k - 1)
        }
    }
}
