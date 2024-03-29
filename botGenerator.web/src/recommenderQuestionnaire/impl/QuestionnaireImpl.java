/**
 */
package recommenderQuestionnaire.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import recommenderQuestionnaire.Evaluation;
import recommenderQuestionnaire.Option;
import recommenderQuestionnaire.Question;
import recommenderQuestionnaire.Questionnaire;
import recommenderQuestionnaire.RecommenderQuestionnaireFactory;
import recommenderQuestionnaire.RecommenderQuestionnairePackage;
import recommenderQuestionnaire.Tool;
import recommenderQuestionnaire.evaluations.Evaluator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Questionnaire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link recommenderQuestionnaire.impl.QuestionnaireImpl#getTools <em>Tools</em>}</li>
 *   <li>{@link recommenderQuestionnaire.impl.QuestionnaireImpl#getQuestions <em>Questions</em>}</li>
 * </ul>
 *
 * @generated NOT
 */
public class QuestionnaireImpl extends MinimalEObjectImpl.Container implements Questionnaire {
	/**
	 * The cached value of the '{@link #getTools() <em>Tools</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTools()
	 * @generated
	 * @ordered
	 */
	protected EList<Tool> tools;

	/**
	 * The cached value of the '{@link #getQuestions() <em>Questions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestions()
	 * @generated
	 * @ordered
	 */
	protected EList<Question> questions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionnaireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RecommenderQuestionnairePackage.Literals.QUESTIONNAIRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tool> getTools() {
		if (tools == null) {
			tools = new EObjectContainmentEList<Tool>(Tool.class, this, RecommenderQuestionnairePackage.QUESTIONNAIRE__TOOLS);
		}
		return tools;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Question> getQuestions() {
		if (questions == null) {
			questions = new EObjectContainmentEList<Question>(Question.class, this, RecommenderQuestionnairePackage.QUESTIONNAIRE__QUESTIONS);
		}
		return questions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RecommenderQuestionnairePackage.QUESTIONNAIRE__TOOLS:
				return ((InternalEList<?>)getTools()).basicRemove(otherEnd, msgs);
			case RecommenderQuestionnairePackage.QUESTIONNAIRE__QUESTIONS:
				return ((InternalEList<?>)getQuestions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RecommenderQuestionnairePackage.QUESTIONNAIRE__TOOLS:
				return getTools();
			case RecommenderQuestionnairePackage.QUESTIONNAIRE__QUESTIONS:
				return getQuestions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RecommenderQuestionnairePackage.QUESTIONNAIRE__TOOLS:
				getTools().clear();
				getTools().addAll((Collection<? extends Tool>)newValue);
				return;
			case RecommenderQuestionnairePackage.QUESTIONNAIRE__QUESTIONS:
				getQuestions().clear();
				getQuestions().addAll((Collection<? extends Question>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RecommenderQuestionnairePackage.QUESTIONNAIRE__TOOLS:
				getTools().clear();
				return;
			case RecommenderQuestionnairePackage.QUESTIONNAIRE__QUESTIONS:
				getQuestions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RecommenderQuestionnairePackage.QUESTIONNAIRE__TOOLS:
				return tools != null && !tools.isEmpty();
			case RecommenderQuestionnairePackage.QUESTIONNAIRE__QUESTIONS:
				return questions != null && !questions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public Question getQuestion(String questionName) {
		for (Question q: getQuestions()) {
			if (q.getName().equals(questionName) || q.getText().equals(questionName)) {
				return q;
			}
		}
		return null;
	}

	@Override
	public Evaluation getEvaluation(String name) {
		for (Question q : getQuestions()) {
			if (q instanceof Evaluation) {
				if (((Evaluation) q).getName().equals(name)) {
					return (Evaluation) q;
				}
			}
		}

		return null;
	}

	@Override
	public Tool createTool(String toolName) {
		Tool tool = getTool(toolName);
		if (tool !=null) {
			return tool;
		}
		tool = RecommenderQuestionnaireFactory.eINSTANCE.createTool();
		tool.setName(toolName);
		/*for (Question q : getQuestions()) {
			for (Option a : q.getOptions()) {
				tool.getUnknownOptions().add(a);
			}
		}*/
		getTools().add(tool);
		return tool;
	}

	public Evaluation createEvaluation(String evName, String evText, boolean multi, List<String> options,
			//Map<String, List<String>> opt_tools_accepted, Map<String, List<String>> opt_tools_refused, Map<String, List<String>> opt_tools_possible, 
			Evaluator ev) {
		
		
		Evaluation evaluation = getEvaluation(evName);
		if (evaluation !=null) {
			return evaluation;
		}
		evaluation = RecommenderQuestionnaireFactory.eINSTANCE.createEvaluation();
		evaluation.setName(evName);
		evaluation.setText(evText);
		evaluation.setMultiresponse(multi);
		evaluation.setEvaluator(ev);
		/*for (String opt : options) {
			Option a = RecommenderQuestionnaireFactory.eINSTANCE.createOption();
			a.setText(opt);
			List<String> acp = opt_tools_accepted.get(opt);
			List<String> ref = opt_tools_refused.get(opt);
			List<String> poss = opt_tools_refused.get(opt);
			for (Tool tool : getTools()) {
				if (acp != null && acp.contains(tool.getName())) {
					a.getAvailable().add(tool);
				} else if (ref != null && ref.contains(tool.getName())) {
					a.getPossible().add(tool);
				} else if (poss != null && poss.contains(tool.getName())) {
					a.getPossible().add(tool);
				} else {
					a.getUnknown().add(tool);
				}
			}
			evaluation.getOptions().add(a);
		}*/
		getQuestions().add(evaluation);
		return evaluation;
	}

	@Override
	public List<Evaluation> getEvaluations() {
		List<Evaluation> ev = new ArrayList<>();
		for (Question q: getQuestions()) {
			if (q instanceof Evaluation) {
				ev.add((Evaluation) q);
			}
		}
		return ev;
	}

	@Override
	public List<Question> getNOTEvaluations() {
		List<Question> ret = new ArrayList<>();
		ret.addAll(getQuestions());
		ret.removeAll(getEvaluations());
		return ret;
	}

	@Override
	public Tool getTool(String string) {
		for (Tool tool : getTools()) {
			if (tool.getName().equalsIgnoreCase(string)) {
				return tool;
			}
		}
		return null;
	}

} //QuestionnaireImpl
