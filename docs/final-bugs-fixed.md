# Final Bugs Fixed – Week 4

1. Fixed task deletion issues caused by duplicate task titles by using unique task IDs.
2. Resolved urgent stack inconsistencies by safely pushing task objects instead of raw input.
3. Fixed persistence issues by rebuilding indexes after loading saved data.
4. Prevented null pointer exceptions during GUI refresh operations.
5. Improved search reliability by supporting both ID-based and title-based lookup.
6. Ensured completed tasks remain synchronized across LinkedList, Stack, and ArrayList.
7. Added safe data saving on application exit to prevent data loss.
