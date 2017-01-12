/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.cep.cep.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.cep.cep.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CepFactoryImpl extends EFactoryImpl implements CepFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CepFactory init()
  {
    try
    {
      CepFactory theCepFactory = (CepFactory)EPackage.Registry.INSTANCE.getEFactory(CepPackage.eNS_URI);
      if (theCepFactory != null)
      {
        return theCepFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CepFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CepFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case CepPackage.MODEL: return createModel();
      case CepPackage.RULE: return createRule();
      case CepPackage.COMPLEX_EVENT: return createComplexEvent();
      case CepPackage.CE_PARAMETER: return createCEParameter();
      case CepPackage.TYPE_REFERENCE: return createTypeReference();
      case CepPackage.PRIMITIVE_TYPE: return createPrimitiveType();
      case CepPackage.INTEGER_TYPE: return createIntegerType();
      case CepPackage.BOOLEAN_TYPE: return createBooleanType();
      case CepPackage.STRING_TYPE: return createStringType();
      case CepPackage.REAL_TYPE: return createRealType();
      case CepPackage.EXPRESSION: return createExpression();
      case CepPackage.LITERAL_EXPRESSION: return createLiteralExpression();
      case CepPackage.OR_EXPRESSION: return createOrExpression();
      case CepPackage.AND_EXPRESSION: return createAndExpression();
      case CepPackage.AS_EXPRESSION: return createAsExpression();
      case CepPackage.EQUALITY_EXPRESSION: return createEqualityExpression();
      case CepPackage.COMPARATIVE_EXPRESSION: return createComparativeExpression();
      case CepPackage.ADDITIVE_EXPRESSION: return createAdditiveExpression();
      case CepPackage.MULTIPLICATIVE_EXPRESSION: return createMultiplicativeExpression();
      case CepPackage.NOT_EXPRESSION: return createNotExpression();
      case CepPackage.PLUS_EXPRESSION: return createPlusExpression();
      case CepPackage.MINUS_EXPRESSION: return createMinusExpression();
      case CepPackage.INTEGER_LITERAL: return createIntegerLiteral();
      case CepPackage.STRING_LITERAL: return createStringLiteral();
      case CepPackage.BOOLEAN_LITERAL: return createBooleanLiteral();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rule createRule()
  {
    RuleImpl rule = new RuleImpl();
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexEvent createComplexEvent()
  {
    ComplexEventImpl complexEvent = new ComplexEventImpl();
    return complexEvent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CEParameter createCEParameter()
  {
    CEParameterImpl ceParameter = new CEParameterImpl();
    return ceParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeReference createTypeReference()
  {
    TypeReferenceImpl typeReference = new TypeReferenceImpl();
    return typeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimitiveType createPrimitiveType()
  {
    PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
    return primitiveType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerType createIntegerType()
  {
    IntegerTypeImpl integerType = new IntegerTypeImpl();
    return integerType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanType createBooleanType()
  {
    BooleanTypeImpl booleanType = new BooleanTypeImpl();
    return booleanType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringType createStringType()
  {
    StringTypeImpl stringType = new StringTypeImpl();
    return stringType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RealType createRealType()
  {
    RealTypeImpl realType = new RealTypeImpl();
    return realType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralExpression createLiteralExpression()
  {
    LiteralExpressionImpl literalExpression = new LiteralExpressionImpl();
    return literalExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrExpression createOrExpression()
  {
    OrExpressionImpl orExpression = new OrExpressionImpl();
    return orExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndExpression createAndExpression()
  {
    AndExpressionImpl andExpression = new AndExpressionImpl();
    return andExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AsExpression createAsExpression()
  {
    AsExpressionImpl asExpression = new AsExpressionImpl();
    return asExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EqualityExpression createEqualityExpression()
  {
    EqualityExpressionImpl equalityExpression = new EqualityExpressionImpl();
    return equalityExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComparativeExpression createComparativeExpression()
  {
    ComparativeExpressionImpl comparativeExpression = new ComparativeExpressionImpl();
    return comparativeExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdditiveExpression createAdditiveExpression()
  {
    AdditiveExpressionImpl additiveExpression = new AdditiveExpressionImpl();
    return additiveExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiplicativeExpression createMultiplicativeExpression()
  {
    MultiplicativeExpressionImpl multiplicativeExpression = new MultiplicativeExpressionImpl();
    return multiplicativeExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotExpression createNotExpression()
  {
    NotExpressionImpl notExpression = new NotExpressionImpl();
    return notExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlusExpression createPlusExpression()
  {
    PlusExpressionImpl plusExpression = new PlusExpressionImpl();
    return plusExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MinusExpression createMinusExpression()
  {
    MinusExpressionImpl minusExpression = new MinusExpressionImpl();
    return minusExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerLiteral createIntegerLiteral()
  {
    IntegerLiteralImpl integerLiteral = new IntegerLiteralImpl();
    return integerLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiteral createBooleanLiteral()
  {
    BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
    return booleanLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CepPackage getCepPackage()
  {
    return (CepPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static CepPackage getPackage()
  {
    return CepPackage.eINSTANCE;
  }

} //CepFactoryImpl
