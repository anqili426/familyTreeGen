/**
 */
package ca.mcgill.model.familytree;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Family Tree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.mcgill.model.familytree.FamilyTree#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @see ca.mcgill.model.familytree.FamilytreePackage#getFamilyTree()
 * @model
 * @generated
 */
public interface FamilyTree extends EObject {
	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link ca.mcgill.model.familytree.Member}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see ca.mcgill.model.familytree.FamilytreePackage#getFamilyTree_Members()
	 * @model containment="true"
	 * @generated
	 */
	EList<Member> getMembers();

} // FamilyTree
