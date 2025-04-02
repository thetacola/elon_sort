//! # Elon sort
//!
//! Will delete items at random, then declare that the list is sorted, regardless of whether or not it is.
//!
//! ##### Advantages
//! - uhh
//! - ummm
//! - ahhhh
//!
//! ## Fear And Questions (FAQ)
//!
//! > ELON: I'm afraid if I sort this list, someone will stop me from ever sorting a list again.
//! >
//! > JOE: Is that why you fuck up every list you're asked to sort?
use rand::{rng, Rng};

/// I feel like this doesnt need much explanation. This exists purely as a joke.
///
/// It will flip a coin for each element and remove them half the time.
///
/// # Examples
/// ```
/// use elon_sort::elon_sort;
/// // Create a vector to 'sort'.
/// let mut vector = vec![1,3,5,2,4,6];
///
/// elon_sort(&mut vector);
///
/// println!("{:?}",vector);
/// // Tada, you will see something like this:
/// // [1,5,4] or
/// // [1,3,5,6] (It is sometimes right.)
/// ```
pub fn elon_sort<T>(array: &mut Vec<T>) {
    let mut rng = rng();
    let mut removals: Vec<usize> = Vec::new();
    for i in 0..array.len() {
        if rng.random_range(0..2) == 1 {
            removals.push(i);
        }
    }
    removals.reverse();
    for removal in removals {
        array.remove(removal);
    }
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn elon_sort_test() {
        let mut vector = vec![1, 2, 3, 5, 6, 3, 2, 1];
        elon_sort(&mut vector);
        println!("{:?}", vector);
    }
}
