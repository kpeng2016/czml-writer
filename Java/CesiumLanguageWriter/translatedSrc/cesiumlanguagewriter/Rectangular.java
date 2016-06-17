package cesiumlanguagewriter;


import agi.foundation.compatibility.*;
import agi.foundation.compatibility.annotations.CS2JInfo;
import agi.foundation.compatibility.annotations.CS2JWarning;
import agi.foundation.compatibility.DoubleHelper;
import agi.foundation.compatibility.IEquatable;
import agi.foundation.compatibility.ImmutableValueType;
import agi.foundation.compatibility.StringHelper;

/**
 *  
 A set of rectilinear 2-dimensional coordinates.
 
 

 * 
 The corresponding 3-dimensional coordinates are  {@link Cartesian} coordinates.
 
 */
@CS2JWarning("Unhandled attribute removed: SuppressMessage")
public class Rectangular implements IEquatable<Rectangular>, ImmutableValueType {
	/**
	 * Initializes a new instance.
	 */
	public Rectangular() {}

	/**
	 *  Gets a set of  {@link Rectangular} coordinates with values of zero.
	

	 */
	public static Rectangular getZero() {
		return s_zero;
	}

	/**
	 *  Gets a set of  {@link Rectangular} coordinates with values of  {@link Double#NaN}.
	
	

	 * 
	Use <code>IsUndefined</code> ({@link Rectangular#getIsUndefined get}) to test whether a  {@link Rectangular} instance
	is undefined since it will return <see langword="true" /> if any of the coordinate values
	are  {@link Double#NaN}.
	
	 */
	public static Rectangular getUndefined() {
		return s_undefined;
	}

	/**
	 *  
	Initializes a set of  {@link Rectangular} coordinates from the provided values.
	
	
	

	 * @param x The linear coordinate along the positive x-axis.
	 * @param y The linear coordinate along the positive y-axis.
	 */
	@CS2JWarning("Unhandled attribute removed: SuppressMessage")
	public Rectangular(double x, double y) {
		m_x = x;
		m_y = y;
	}

	/**
	 *  Gets the linear coordinate along the positive x-axis.
	

	 */
	public final double getX() {
		return m_x;
	}

	/**
	 *  Gets the linear coordinate along the positive y-axis.
	

	 */
	public final double getY() {
		return m_y;
	}

	/**
	 *  
	Inverts this instance.
	
	

	 * @return A set of  {@link Rectangular} coordinates that represents the inverse of this instance.
	 */
	@CS2JWarning("Unhandled attribute removed: Pure")
	public final Rectangular invert() {
		return new Rectangular(-m_x, -m_y);
	}

	/**
	 *  
	Multiplies this instance by a scalar.
	
	
	

	 * @param scalar The multiplier, or value which is to multiply this instance.
	 * @return A set of  {@link Rectangular} coordinates that represents the result of the multiplication.
	 */
	@CS2JWarning("Unhandled attribute removed: Pure")
	public final Rectangular multiply(double scalar) {
		return new Rectangular(m_x * scalar, m_y * scalar);
	}

	/**
	 *  
	Divides this instance by a scalar.
	
	
	

	 * @param scalar The divisor, or value which is to divide this instance.
	 * @return A set of  {@link Rectangular} coordinates that represents the result of the division.
	 */
	@CS2JWarning("Unhandled attribute removed: Pure")
	public final Rectangular divide(double scalar) {
		return new Rectangular(m_x / scalar, m_y / scalar);
	}

	/**
	 *  
	Adds the specified set of  {@link Rectangular} coordinates to this instance.
	
	
	

	 * @param other The addend, or value which is to be added to this instance.
	 * @return A set of  {@link Rectangular} coordinates that represents the result of the addition.
	 */
	@CS2JWarning("Unhandled attribute removed: Pure")
	public final Rectangular add(Rectangular other) {
		return new Rectangular(m_x + other.m_x, m_y + other.m_y);
	}

	/**
	 *  
	Subtracts the specified set of  {@link Rectangular} coordinates from this instance.
	
	
	

	 * @param other The subtrahend, or value which is to be subtracted from this instance.
	 * @return A set of  {@link Rectangular} coordinates that represents the result of the subtraction.
	 */
	@CS2JWarning("Unhandled attribute removed: Pure")
	public final Rectangular subtract(Rectangular other) {
		return new Rectangular(m_x - other.m_x, m_y - other.m_y);
	}

	/**
	 *  
	Forms the dot product of the specified set of  {@link Rectangular} coordinates with this instance.
	
	
	

	 * @param other The set of  {@link Rectangular} coordinates to dot with this instance.
	 * @return A  <code>double</code> that represents the result of the product.
	 */
	@CS2JWarning("Unhandled attribute removed: Pure")
	public final double dot(Rectangular other) {
		return m_x * other.m_x + m_y * other.m_y;
	}

	/**
	 *  
	Multiplies a specified set of  {@link Rectangular} coordinates by a scalar.
	
	
	
	

	 * @param left The multiplicand, or value which is to be multiplied by <code>right</code>.
	 * @param right The multiplier, or value which is to multiply <code>left</code>.
	 * @return A set of  {@link Rectangular} coordinates that represents the result of the multiplication.
	 */
	@CS2JInfo("This method implements the functionality of the overloaded operator: 'Rectangular *(Rectangular,System.Double)'")
	public static Rectangular multiply(Rectangular left, double right) {
		return left.multiply(right);
	}

	/**
	 *  
	Multiplies a scalar by a specified set of set of  {@link Rectangular} coordinates.
	
	
	
	

	 * @param left The multiplicand, or value which is to be multiplied by <code>right</code>.
	 * @param right The multiplier, or value which is to multiply <code>left</code>.
	 * @return A set of  {@link Rectangular} coordinates that represents the result of the multiplication.
	 */
	@CS2JInfo("This method implements the functionality of the overloaded operator: 'Rectangular *(System.Double,Rectangular)'")
	public static Rectangular multiply(double left, Rectangular right) {
		return right.multiply(left);
	}

	/**
	 *  
	Divides a specified set of  {@link Rectangular} coordinates by a scalar.
	
	
	
	

	 * @param left The dividend, or value which is to be divided by <code>right</code>.
	 * @param right The divisor, or value which is to divide <code>left</code>.
	 * @return A set of  {@link Rectangular} coordinates that represents the result of the division.
	 */
	@CS2JInfo("This method implements the functionality of the overloaded operator: 'Rectangular /(Rectangular,System.Double)'")
	public static Rectangular divide(Rectangular left, double right) {
		return left.divide(right);
	}

	/**
	 *  
	Adds a specified set of  {@link Rectangular} coordinates to another specified set of  {@link Cartesian} coordinates.
	
	
	
	

	 * @param left The augend, or value to which <code>right</code> is to be added.
	 * @param right The addend, or value which is to be added to <code>left</code>.
	 * @return A set of  {@link Rectangular} coordinates that represents the result of the addition.
	 */
	@CS2JInfo("This method implements the functionality of the overloaded operator: 'Rectangular +(Rectangular,Rectangular)'")
	public static Rectangular add(Rectangular left, Rectangular right) {
		return left.add(right);
	}

	/**
	 *  
	Subtracts a specified set of  {@link Rectangular} coordinates from another specified set of  {@link Rectangular} coordinates.
	
	
	
	

	 * @param left The minuend, or value from which <code>right</code> is to be subtracted.
	 * @param right The subtrahend, or value which is to be subtracted from <code>left</code>.
	 * @return A set of  {@link Rectangular} coordinates that represents the result of the subtraction.
	 */
	@CS2JInfo("This method implements the functionality of the overloaded operator: 'Rectangular -(Rectangular,Rectangular)'")
	public static Rectangular subtract(Rectangular left, Rectangular right) {
		return left.subtract(right);
	}

	/**
	 *  
	Negates the specified set of  {@link Rectangular} coordinates, yielding a new set of  {@link Rectangular} coordinates.
	
	
	

	 * @param coordinates The set of coordinates.
	 * @return The result of negating the elements of the original set of  {@link Rectangular} coordinates.
	 */
	@CS2JInfo("This method implements the functionality of the overloaded operator: 'Rectangular -(Rectangular)'")
	public static Rectangular negate(Rectangular coordinates) {
		return new Rectangular(-coordinates.m_x, -coordinates.m_y);
	}

	/**
	 *  
	Produces a set of  {@link Rectangular} coordinates representing this instance which results from rotating
	the original axes used to represent this instance by the provided angle.
	
	
	
	

	 * 
	This type of rotation is sometimes referred to as an "alias rotation".
	
	 * @param angle The angle of rotation.
	 * @return A set of  {@link Rectangular} coordinates which is the result of the rotation.
	 */
	@CS2JWarning("Unhandled attribute removed: Pure")
	public final Rectangular rotate(double angle) {
		double c = Math.cos(angle);
		double s = Math.sin(angle);
		return new Rectangular(c * m_x - s * m_y, s * m_x + c * m_y);
	}

	/**
	 *  
	Indicates whether another object is exactly equal to this instance.
	
	
	

	 * @param obj The object to compare to this instance.
	 * @return <see langword="true" /> if <code>obj</code> is an instance of this type and represents the same value as this instance; otherwise, <see langword="false" />.
	 */
	@Override
	public boolean equals(Object obj) {
		return obj instanceof Rectangular && equalsType((Rectangular) obj);
	}

	/**
	 *  
	Indicates whether another instance of this type is exactly equal to this instance.
	
	
	

	 * @param other The instance to compare to this instance.
	 * @return <see langword="true" /> if <code>other</code> represents the same value as this instance; otherwise, <see langword="false" />.
	 */
	public final boolean equalsType(Rectangular other) {
		return Double.valueOf(m_x).equals(other.m_x) && Double.valueOf(m_y).equals(other.m_y);
	}

	/**
	 *  
	Indicates whether each coordinate value of another instance of this type
	is within the required tolerance of the corresponding coordinate value of this instance.
	
	
	
	

	 * @param other The set of  {@link Rectangular} coordinates to compare to this instance.
	 * @param epsilon The limit at which the absolute differences between the coordinate values will not be considered equal.
	 * @return 
	<see langword="true" /> if the absolute differences are less than or equal to <code>epsilon</code>; otherwise, <see langword="false" />.
	
	 */
	public final boolean equalsEpsilon(Rectangular other, double epsilon) {
		return Math.abs(m_x - other.m_x) <= epsilon && Math.abs(m_y - other.m_y) <= epsilon;
	}

	/**
	 *  
	Returns a hash code for this instance, which is suitable for use in hashing algorithms and data structures like a hash table.
	
	

	 * @return A hash code for the current object.
	 */
	@Override
	public int hashCode() {
		return HashCode.combine(DoubleHelper.hashCode(m_x), DoubleHelper.hashCode(m_y));
	}

	/**
	 *  
	Returns the string representation of the value of this instance.
	
	

	 * @return 
	A string that represents the value of this instance in the form
	"X, Y".
	
	 */
	@Override
	public String toString() {
		return StringHelper.format("{0}, {1}", m_x, m_y);
	}

	/**
	 *  
	Returns <see langword="true" /> if the two instances are exactly equal.
	
	
	
	

	 * @param left The instance to compare to <code>right</code>.
	 * @param right The instance to compare to <code>left</code>.
	 * @return 
	<see langword="true" /> if <code>left</code> represents the same value as <code>right</code>; otherwise, <see langword="false" />.
	
	 */
	@CS2JInfo("This method implements the functionality of the overloaded operator: 'System.Boolean ==(Rectangular,Rectangular)'")
	public static boolean equals(Rectangular left, Rectangular right) {
		return left.equalsType(right);
	}

	/**
	 *  
	Returns <see langword="true" /> if the two instances are not exactly equal.
	
	
	
	

	 * @param left The instance to compare to <code>right</code>.
	 * @param right The instance to compare to <code>left</code>.
	 * @return 
	<see langword="true" /> if <code>left</code> does not represent the same value as <code>right</code>; otherwise, <see langword="false" />.
	
	 */
	@CS2JInfo("This method implements the functionality of the overloaded operator: 'System.Boolean !=(Rectangular,Rectangular)'")
	public static boolean notEquals(Rectangular left, Rectangular right) {
		return !left.equalsType(right);
	}

	/**
	 *  Gets whether or not any of the coordinates for this instance have the value  {@link Double#NaN}.
	

	 */
	public final boolean getIsUndefined() {
		return Double.isNaN(m_x) || Double.isNaN(m_y);
	}

	private double m_x;
	private double m_y;
	private static Rectangular s_zero = new Rectangular(0.0, 0.0);
	private static Rectangular s_undefined = new Rectangular(Double.NaN, Double.NaN);
}