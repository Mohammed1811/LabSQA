# Overview
This repository contains code snippets of each lab, seperated in distinct packages (Each package labeled with the lab name), but all in the same project.

This README also includes some of the corrections in the original classes of Lab 2 (As requested in the lab itself).



# Lab 2 – Fixes and Explanation

This project contains several simple algorithmic Java classes that were initially implemented with common logical or off-by-one errors. These errors were identified and corrected, particularly focusing on **strict (`<`, `>`) vs. non-strict (`<=`, `>=`) inequalities** in control flow and indexing.

---

## ✅ Fixes Summary (Class by Class)

### 1. `Palindrome.java`

- **Issue:** No functional issue, but the pointer logic needed clarity.
- **Fix:** Made it explicit that:
  - `i++` (left pointer moves forward)
  - `j--` (right pointer moves backward)
- **Why it matters:** Ensures the string is checked symmetrically from both ends.

---

### 2. `Anagram.java`

- **Issue:** A potential off-by-one error if `<=` were used instead of `<`.
- **Fix:** Used `i < s1.length()` in the loop.
- **Why it matters:** Ensures the loop does not exceed string bounds and maintains correct character frequency counts.

---

### 3. `BinarySearch.java`

- **Issue:** Originally used a **strict inequality** (`low < high`) which fails when `element` is the first or last value.
- **Fix:** Replaced with **non-strict inequality** (`low <= high`).
- **Why it matters:** Binary search must consider the case when `low == high` to find the target at the edges.

---


### 5. `RomanNumeral.java`

- **Issues and Fixes:**
  - In the `for` loop, used **strict inequality** (`i < symbols.length`) instead of `<=` to avoid out-of-bounds.
  - Inside the loop, used **non-strict inequality** (`n >= values[i]`) instead of `>`.
- **Why it matters:** Ensures proper Roman numeral construction, especially for exact matches, and ensures the loop does not exceed array bounds.

---

### 6. `FizzBuzz.java`

- **Issue:** Check for invalid input used `n <= 1`, which was too strict (considering 1 is a positive integer).
- **Fix:** Used **strict inequality** (`n < 1`) to reject non-positive inputs.
- **Why it matters:** Makes it clear that only positive integers are valid inputs for FizzBuzz.

