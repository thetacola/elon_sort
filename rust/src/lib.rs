use rand::{rng, Rng};



///
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
        let mut vector = vec![1,2,3,5,6,3,2,1];
        elon_sort(&mut vector);
        println!("{:?}",vector);
    }
}
