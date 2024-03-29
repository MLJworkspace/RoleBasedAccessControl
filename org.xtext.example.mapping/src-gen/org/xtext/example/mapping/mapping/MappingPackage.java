/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mapping.mapping;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.mapping.mapping.MappingFactory
 * @model kind="package"
 * @generated
 */
public interface MappingPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "mapping";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/mapping/Mapping";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "mapping";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MappingPackage eINSTANCE = org.xtext.example.mapping.mapping.impl.MappingPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mapping.mapping.impl.MappingModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mapping.mapping.impl.MappingModelImpl
   * @see org.xtext.example.mapping.mapping.impl.MappingPackageImpl#getMappingModel()
   * @generated
   */
  int MAPPING_MODEL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_MODEL__NAME = 0;

  /**
   * The feature id for the '<em><b>Source Metamodels</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_MODEL__SOURCE_METAMODELS = 1;

  /**
   * The feature id for the '<em><b>Main Source Metamodel</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_MODEL__MAIN_SOURCE_METAMODEL = 2;

  /**
   * The feature id for the '<em><b>Target Metamodels</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_MODEL__TARGET_METAMODELS = 3;

  /**
   * The feature id for the '<em><b>Rules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_MODEL__RULES = 4;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_MODEL_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.example.mapping.mapping.impl.MetamodelImpl <em>Metamodel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mapping.mapping.impl.MetamodelImpl
   * @see org.xtext.example.mapping.mapping.impl.MappingPackageImpl#getMetamodel()
   * @generated
   */
  int METAMODEL = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAMODEL__NAME = 0;

  /**
   * The feature id for the '<em><b>Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAMODEL__MODEL = 1;

  /**
   * The number of structural features of the '<em>Metamodel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAMODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mapping.mapping.impl.SourceMetamodelImpl <em>Source Metamodel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mapping.mapping.impl.SourceMetamodelImpl
   * @see org.xtext.example.mapping.mapping.impl.MappingPackageImpl#getSourceMetamodel()
   * @generated
   */
  int SOURCE_METAMODEL = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE_METAMODEL__NAME = METAMODEL__NAME;

  /**
   * The feature id for the '<em><b>Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE_METAMODEL__MODEL = METAMODEL__MODEL;

  /**
   * The number of structural features of the '<em>Source Metamodel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE_METAMODEL_FEATURE_COUNT = METAMODEL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mapping.mapping.impl.TargetMetamodelImpl <em>Target Metamodel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mapping.mapping.impl.TargetMetamodelImpl
   * @see org.xtext.example.mapping.mapping.impl.MappingPackageImpl#getTargetMetamodel()
   * @generated
   */
  int TARGET_METAMODEL = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET_METAMODEL__NAME = METAMODEL__NAME;

  /**
   * The feature id for the '<em><b>Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET_METAMODEL__MODEL = METAMODEL__MODEL;

  /**
   * The number of structural features of the '<em>Target Metamodel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET_METAMODEL_FEATURE_COUNT = METAMODEL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mapping.mapping.impl.MappingRuleImpl <em>Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mapping.mapping.impl.MappingRuleImpl
   * @see org.xtext.example.mapping.mapping.impl.MappingPackageImpl#getMappingRule()
   * @generated
   */
  int MAPPING_RULE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_RULE__NAME = 0;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_RULE__VAR = 1;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_RULE__IDENTIFIER = 2;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_RULE__SOURCE = 3;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_RULE__VARIABLE = 4;

  /**
   * The feature id for the '<em><b>EEnum Literal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_RULE__EENUM_LITERAL = 5;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_RULE__TARGET = 6;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_RULE__OPERATOR = 7;

  /**
   * The feature id for the '<em><b>Condition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_RULE__CONDITION = 8;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_RULE__COMMENT = 9;

  /**
   * The feature id for the '<em><b>Child Rules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_RULE__CHILD_RULES = 10;

  /**
   * The feature id for the '<em><b>Child Helpers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_RULE__CHILD_HELPERS = 11;

  /**
   * The number of structural features of the '<em>Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_RULE_FEATURE_COUNT = 12;

  /**
   * The meta object id for the '{@link org.xtext.example.mapping.mapping.impl.HelperStatementImpl <em>Helper Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mapping.mapping.impl.HelperStatementImpl
   * @see org.xtext.example.mapping.mapping.impl.MappingPackageImpl#getHelperStatement()
   * @generated
   */
  int HELPER_STATEMENT = 4;

  /**
   * The feature id for the '<em><b>Statement</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER_STATEMENT__STATEMENT = 0;

  /**
   * The feature id for the '<em><b>Child Rules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER_STATEMENT__CHILD_RULES = 1;

  /**
   * The feature id for the '<em><b>Child Helpers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER_STATEMENT__CHILD_HELPERS = 2;

  /**
   * The number of structural features of the '<em>Helper Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HELPER_STATEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mapping.mapping.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mapping.mapping.impl.VariableDeclarationImpl
   * @see org.xtext.example.mapping.mapping.impl.MappingPackageImpl#getVariableDeclaration()
   * @generated
   */
  int VARIABLE_DECLARATION = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__VALUE = 1;

  /**
   * The number of structural features of the '<em>Variable Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mapping.mapping.Operator <em>Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mapping.mapping.Operator
   * @see org.xtext.example.mapping.mapping.impl.MappingPackageImpl#getOperator()
   * @generated
   */
  int OPERATOR = 7;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mapping.mapping.MappingModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.example.mapping.mapping.MappingModel
   * @generated
   */
  EClass getMappingModel();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mapping.mapping.MappingModel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mapping.mapping.MappingModel#getName()
   * @see #getMappingModel()
   * @generated
   */
  EAttribute getMappingModel_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mapping.mapping.MappingModel#getSourceMetamodels <em>Source Metamodels</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Source Metamodels</em>'.
   * @see org.xtext.example.mapping.mapping.MappingModel#getSourceMetamodels()
   * @see #getMappingModel()
   * @generated
   */
  EReference getMappingModel_SourceMetamodels();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mapping.mapping.MappingModel#getMainSourceMetamodel <em>Main Source Metamodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Main Source Metamodel</em>'.
   * @see org.xtext.example.mapping.mapping.MappingModel#getMainSourceMetamodel()
   * @see #getMappingModel()
   * @generated
   */
  EReference getMappingModel_MainSourceMetamodel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mapping.mapping.MappingModel#getTargetMetamodels <em>Target Metamodels</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Target Metamodels</em>'.
   * @see org.xtext.example.mapping.mapping.MappingModel#getTargetMetamodels()
   * @see #getMappingModel()
   * @generated
   */
  EReference getMappingModel_TargetMetamodels();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mapping.mapping.MappingModel#getRules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rules</em>'.
   * @see org.xtext.example.mapping.mapping.MappingModel#getRules()
   * @see #getMappingModel()
   * @generated
   */
  EReference getMappingModel_Rules();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mapping.mapping.SourceMetamodel <em>Source Metamodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Source Metamodel</em>'.
   * @see org.xtext.example.mapping.mapping.SourceMetamodel
   * @generated
   */
  EClass getSourceMetamodel();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mapping.mapping.TargetMetamodel <em>Target Metamodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Target Metamodel</em>'.
   * @see org.xtext.example.mapping.mapping.TargetMetamodel
   * @generated
   */
  EClass getTargetMetamodel();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mapping.mapping.MappingRule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule</em>'.
   * @see org.xtext.example.mapping.mapping.MappingRule
   * @generated
   */
  EClass getMappingRule();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mapping.mapping.MappingRule#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mapping.mapping.MappingRule#getName()
   * @see #getMappingRule()
   * @generated
   */
  EAttribute getMappingRule_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mapping.mapping.MappingRule#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see org.xtext.example.mapping.mapping.MappingRule#getVar()
   * @see #getMappingRule()
   * @generated
   */
  EReference getMappingRule_Var();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mapping.mapping.MappingRule#getIdentifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Identifier</em>'.
   * @see org.xtext.example.mapping.mapping.MappingRule#getIdentifier()
   * @see #getMappingRule()
   * @generated
   */
  EAttribute getMappingRule_Identifier();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mapping.mapping.MappingRule#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see org.xtext.example.mapping.mapping.MappingRule#getSource()
   * @see #getMappingRule()
   * @generated
   */
  EReference getMappingRule_Source();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mapping.mapping.MappingRule#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Variable</em>'.
   * @see org.xtext.example.mapping.mapping.MappingRule#getVariable()
   * @see #getMappingRule()
   * @generated
   */
  EReference getMappingRule_Variable();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mapping.mapping.MappingRule#getEEnumLiteral <em>EEnum Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>EEnum Literal</em>'.
   * @see org.xtext.example.mapping.mapping.MappingRule#getEEnumLiteral()
   * @see #getMappingRule()
   * @generated
   */
  EReference getMappingRule_EEnumLiteral();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mapping.mapping.MappingRule#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see org.xtext.example.mapping.mapping.MappingRule#getTarget()
   * @see #getMappingRule()
   * @generated
   */
  EReference getMappingRule_Target();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mapping.mapping.MappingRule#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see org.xtext.example.mapping.mapping.MappingRule#getOperator()
   * @see #getMappingRule()
   * @generated
   */
  EAttribute getMappingRule_Operator();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mapping.mapping.MappingRule#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Condition</em>'.
   * @see org.xtext.example.mapping.mapping.MappingRule#getCondition()
   * @see #getMappingRule()
   * @generated
   */
  EAttribute getMappingRule_Condition();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mapping.mapping.MappingRule#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see org.xtext.example.mapping.mapping.MappingRule#getComment()
   * @see #getMappingRule()
   * @generated
   */
  EAttribute getMappingRule_Comment();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mapping.mapping.MappingRule#getChildRules <em>Child Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Child Rules</em>'.
   * @see org.xtext.example.mapping.mapping.MappingRule#getChildRules()
   * @see #getMappingRule()
   * @generated
   */
  EReference getMappingRule_ChildRules();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mapping.mapping.MappingRule#getChildHelpers <em>Child Helpers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Child Helpers</em>'.
   * @see org.xtext.example.mapping.mapping.MappingRule#getChildHelpers()
   * @see #getMappingRule()
   * @generated
   */
  EReference getMappingRule_ChildHelpers();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mapping.mapping.HelperStatement <em>Helper Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Helper Statement</em>'.
   * @see org.xtext.example.mapping.mapping.HelperStatement
   * @generated
   */
  EClass getHelperStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mapping.mapping.HelperStatement#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Statement</em>'.
   * @see org.xtext.example.mapping.mapping.HelperStatement#getStatement()
   * @see #getHelperStatement()
   * @generated
   */
  EAttribute getHelperStatement_Statement();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mapping.mapping.HelperStatement#getChildRules <em>Child Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Child Rules</em>'.
   * @see org.xtext.example.mapping.mapping.HelperStatement#getChildRules()
   * @see #getHelperStatement()
   * @generated
   */
  EReference getHelperStatement_ChildRules();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mapping.mapping.HelperStatement#getChildHelpers <em>Child Helpers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Child Helpers</em>'.
   * @see org.xtext.example.mapping.mapping.HelperStatement#getChildHelpers()
   * @see #getHelperStatement()
   * @generated
   */
  EReference getHelperStatement_ChildHelpers();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mapping.mapping.Metamodel <em>Metamodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Metamodel</em>'.
   * @see org.xtext.example.mapping.mapping.Metamodel
   * @generated
   */
  EClass getMetamodel();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mapping.mapping.Metamodel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mapping.mapping.Metamodel#getName()
   * @see #getMetamodel()
   * @generated
   */
  EAttribute getMetamodel_Name();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mapping.mapping.Metamodel#getModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Model</em>'.
   * @see org.xtext.example.mapping.mapping.Metamodel#getModel()
   * @see #getMetamodel()
   * @generated
   */
  EReference getMetamodel_Model();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mapping.mapping.VariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Declaration</em>'.
   * @see org.xtext.example.mapping.mapping.VariableDeclaration
   * @generated
   */
  EClass getVariableDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mapping.mapping.VariableDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mapping.mapping.VariableDeclaration#getName()
   * @see #getVariableDeclaration()
   * @generated
   */
  EAttribute getVariableDeclaration_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mapping.mapping.VariableDeclaration#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.example.mapping.mapping.VariableDeclaration#getValue()
   * @see #getVariableDeclaration()
   * @generated
   */
  EAttribute getVariableDeclaration_Value();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.mapping.mapping.Operator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Operator</em>'.
   * @see org.xtext.example.mapping.mapping.Operator
   * @generated
   */
  EEnum getOperator();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MappingFactory getMappingFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.mapping.mapping.impl.MappingModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mapping.mapping.impl.MappingModelImpl
     * @see org.xtext.example.mapping.mapping.impl.MappingPackageImpl#getMappingModel()
     * @generated
     */
    EClass MAPPING_MODEL = eINSTANCE.getMappingModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPING_MODEL__NAME = eINSTANCE.getMappingModel_Name();

    /**
     * The meta object literal for the '<em><b>Source Metamodels</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING_MODEL__SOURCE_METAMODELS = eINSTANCE.getMappingModel_SourceMetamodels();

    /**
     * The meta object literal for the '<em><b>Main Source Metamodel</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING_MODEL__MAIN_SOURCE_METAMODEL = eINSTANCE.getMappingModel_MainSourceMetamodel();

    /**
     * The meta object literal for the '<em><b>Target Metamodels</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING_MODEL__TARGET_METAMODELS = eINSTANCE.getMappingModel_TargetMetamodels();

    /**
     * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING_MODEL__RULES = eINSTANCE.getMappingModel_Rules();

    /**
     * The meta object literal for the '{@link org.xtext.example.mapping.mapping.impl.SourceMetamodelImpl <em>Source Metamodel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mapping.mapping.impl.SourceMetamodelImpl
     * @see org.xtext.example.mapping.mapping.impl.MappingPackageImpl#getSourceMetamodel()
     * @generated
     */
    EClass SOURCE_METAMODEL = eINSTANCE.getSourceMetamodel();

    /**
     * The meta object literal for the '{@link org.xtext.example.mapping.mapping.impl.TargetMetamodelImpl <em>Target Metamodel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mapping.mapping.impl.TargetMetamodelImpl
     * @see org.xtext.example.mapping.mapping.impl.MappingPackageImpl#getTargetMetamodel()
     * @generated
     */
    EClass TARGET_METAMODEL = eINSTANCE.getTargetMetamodel();

    /**
     * The meta object literal for the '{@link org.xtext.example.mapping.mapping.impl.MappingRuleImpl <em>Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mapping.mapping.impl.MappingRuleImpl
     * @see org.xtext.example.mapping.mapping.impl.MappingPackageImpl#getMappingRule()
     * @generated
     */
    EClass MAPPING_RULE = eINSTANCE.getMappingRule();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPING_RULE__NAME = eINSTANCE.getMappingRule_Name();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING_RULE__VAR = eINSTANCE.getMappingRule_Var();

    /**
     * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPING_RULE__IDENTIFIER = eINSTANCE.getMappingRule_Identifier();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING_RULE__SOURCE = eINSTANCE.getMappingRule_Source();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING_RULE__VARIABLE = eINSTANCE.getMappingRule_Variable();

    /**
     * The meta object literal for the '<em><b>EEnum Literal</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING_RULE__EENUM_LITERAL = eINSTANCE.getMappingRule_EEnumLiteral();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING_RULE__TARGET = eINSTANCE.getMappingRule_Target();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPING_RULE__OPERATOR = eINSTANCE.getMappingRule_Operator();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPING_RULE__CONDITION = eINSTANCE.getMappingRule_Condition();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPING_RULE__COMMENT = eINSTANCE.getMappingRule_Comment();

    /**
     * The meta object literal for the '<em><b>Child Rules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING_RULE__CHILD_RULES = eINSTANCE.getMappingRule_ChildRules();

    /**
     * The meta object literal for the '<em><b>Child Helpers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING_RULE__CHILD_HELPERS = eINSTANCE.getMappingRule_ChildHelpers();

    /**
     * The meta object literal for the '{@link org.xtext.example.mapping.mapping.impl.HelperStatementImpl <em>Helper Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mapping.mapping.impl.HelperStatementImpl
     * @see org.xtext.example.mapping.mapping.impl.MappingPackageImpl#getHelperStatement()
     * @generated
     */
    EClass HELPER_STATEMENT = eINSTANCE.getHelperStatement();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HELPER_STATEMENT__STATEMENT = eINSTANCE.getHelperStatement_Statement();

    /**
     * The meta object literal for the '<em><b>Child Rules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HELPER_STATEMENT__CHILD_RULES = eINSTANCE.getHelperStatement_ChildRules();

    /**
     * The meta object literal for the '<em><b>Child Helpers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HELPER_STATEMENT__CHILD_HELPERS = eINSTANCE.getHelperStatement_ChildHelpers();

    /**
     * The meta object literal for the '{@link org.xtext.example.mapping.mapping.impl.MetamodelImpl <em>Metamodel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mapping.mapping.impl.MetamodelImpl
     * @see org.xtext.example.mapping.mapping.impl.MappingPackageImpl#getMetamodel()
     * @generated
     */
    EClass METAMODEL = eINSTANCE.getMetamodel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METAMODEL__NAME = eINSTANCE.getMetamodel_Name();

    /**
     * The meta object literal for the '<em><b>Model</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METAMODEL__MODEL = eINSTANCE.getMetamodel_Model();

    /**
     * The meta object literal for the '{@link org.xtext.example.mapping.mapping.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mapping.mapping.impl.VariableDeclarationImpl
     * @see org.xtext.example.mapping.mapping.impl.MappingPackageImpl#getVariableDeclaration()
     * @generated
     */
    EClass VARIABLE_DECLARATION = eINSTANCE.getVariableDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DECLARATION__NAME = eINSTANCE.getVariableDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DECLARATION__VALUE = eINSTANCE.getVariableDeclaration_Value();

    /**
     * The meta object literal for the '{@link org.xtext.example.mapping.mapping.Operator <em>Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mapping.mapping.Operator
     * @see org.xtext.example.mapping.mapping.impl.MappingPackageImpl#getOperator()
     * @generated
     */
    EEnum OPERATOR = eINSTANCE.getOperator();

  }

} //MappingPackage
