fun main() {
    // 1. Create employees
    val employees = mapOf(
        "ID_001" to FullTimeEmployee("Alice Smith", 5000.0, 1000.0),
        "ID_002" to PartTimeEmployee("Bob Jones", 25.0, 80), 
        "ID_003" to FullTimeEmployee("Charlie Brown", 6000.0, 500.0),
        "ID_004" to PartTimeEmployee("Diana Prince", 40.0, 60)
    )

    println("--- Employee Payroll Report ---")

    // 2. Loop through the map and display details
    for ((id, employee) in employees) {
        val salary = employee.calculateSalary()
        
        // We use the new helper function 'getEmployeeName()'
        println("ID: $id | Name: ${employee.getEmployeeName()} | Final Salary: $${salary}")
    }
}

// --- Base Class ---
open class Employee(
    protected val name: String, 
    protected val baseSalary: Double
) {
    open fun calculateSalary(): Double {
        return baseSalary
    }

    // RENAMED: Changed from getName() to getEmployeeName() to avoid the clash
    fun getEmployeeName(): String {
        return name
    }
}

// --- Subclass 1: Full Time ---
class FullTimeEmployee(
    name: String, 
    baseSalary: Double, 
    private val bonus: Double
) : Employee(name, baseSalary) {
    
    override fun calculateSalary(): Double {
        return baseSalary + bonus
    }
}

// --- Subclass 2: Part Time ---
class PartTimeEmployee(
    name: String, 
    private val hourlyRate: Double, 
    private val hoursWorked: Int
) : Employee(name, 0.0) { 
    
    override fun calculateSalary(): Double {
        return hourlyRate * hoursWorked
    }
}