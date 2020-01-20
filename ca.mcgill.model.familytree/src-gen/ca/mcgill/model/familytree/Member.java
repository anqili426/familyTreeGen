/**
 */
package ca.mcgill.model.familytree;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.model.familytree.Member#getName <em>Name</em>}</li>
 *   <li>{@link ca.mcgill.model.familytree.Member#getAge <em>Age</em>}</li>
 *   <li>{@link ca.mcgill.model.familytree.Member#getChildren <em>Children</em>}</li>
 *   <li>{@link ca.mcgill.model.familytree.Member#getParents <em>Parents</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.model.familytree.FamilytreePackage#getMember()
 * @model
 * @generated
 */
public interface Member extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ca.mcgill.model.familytree.FamilytreePackage#getMember_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ca.mcgill.model.familytree.Member#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #setAge(int)
	 * @see ca.mcgill.model.familytree.FamilytreePackage#getMember_Age()
	 * @model default="0"
	 * @generated
	 */
	int getAge();

	/**
	 * Sets the value of the '{@link ca.mcgill.model.familytree.Member#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' attribute.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(int value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link ca.mcgill.model.familytree.Member}.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.model.familytree.Member#getParents <em>Parents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see ca.mcgill.model.familytree.FamilytreePackage#getMember_Children()
	 * @see ca.mcgill.model.familytree.Member#getParents
	 * @model opposite="parents"
	 * @generated
	 */
	EList<Member> getChildren();

	/**
	 * Returns the value of the '<em><b>Parents</b></em>' reference list.
	 * The list contents are of type {@link ca.mcgill.model.familytree.Member}.
	 * It is bidirectional and its opposite is '{@link ca.mcgill.model.familytree.Member#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parents</em>' reference list.
	 * @see ca.mcgill.model.familytree.FamilytreePackage#getMember_Parents()
	 * @see ca.mcgill.model.familytree.Member#getChildren
	 * @model opposite="children" upper="2"
	 * @generated
	 */
	EList<Member> getParents();

} // Member
