/**
 * FactSet Search Answers API
 * The FactSet Search Answers API provides answers to search queries, reflecting the data shown within FactSet Search Answers, and allowing you to easily add financial data to your widgets, lookups, bots, and assistants. The API understands a fixed amount of search terms and returns structured data from FactSet’s many data sources. Possible answers include Price of a Company, Top 10 Year-to-Date Gainers, Revenue per Passenger Mile, and many more.
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: FactSearch.Team@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import AnswerWithoutData from './AnswerWithoutData';
import AnswerWithoutDataAllOfTemplateData from './AnswerWithoutDataAllOfTemplateData';
import ColoredValueLabelDateAnswer from './ColoredValueLabelDateAnswer';
import LabelValueChangeLabelValueChangeAnswer from './LabelValueChangeLabelValueChangeAnswer';
import LinkTextBlockAnswer from './LinkTextBlockAnswer';
import NoAnswersFound from './NoAnswersFound';
import PercentChangeLabelAnswer from './PercentChangeLabelAnswer';
import RankedTableAnswer from './RankedTableAnswer';
import TableAnswer from './TableAnswer';
import TableTableAnswer from './TableTableAnswer';
import TextBlockFootingAnswer from './TextBlockFootingAnswer';
import ValueChangeDateLabelAnswer from './ValueChangeDateLabelAnswer';
import ValueLabelAnswer from './ValueLabelAnswer';
import ValueLabelDateAnswer from './ValueLabelDateAnswer';
import ValueLabelDateDataPairListAnswer from './ValueLabelDateDataPairListAnswer';
import ValueLabelDateTextBlockAnswer from './ValueLabelDateTextBlockAnswer';

/**
 * The DataAnswerData model module.
 * @module model/DataAnswerData
 */
class DataAnswerData {
    /**
     * Constructs a new <code>DataAnswerData</code>.
     * @alias module:model/DataAnswerData
     * @implements module:model/LinkTextBlockAnswer
     * @implements module:model/TextBlockFootingAnswer
     * @implements module:model/PercentChangeLabelAnswer
     * @implements module:model/ValueChangeDateLabelAnswer
     * @implements module:model/RankedTableAnswer
     * @implements module:model/TableAnswer
     * @implements module:model/TableTableAnswer
     * @implements module:model/ValueLabelAnswer
     * @implements module:model/ValueLabelDateAnswer
     * @implements module:model/ColoredValueLabelDateAnswer
     * @implements module:model/ValueLabelDateTextBlockAnswer
     * @implements module:model/ValueLabelDateDataPairListAnswer
     * @implements module:model/LabelValueChangeLabelValueChangeAnswer
     * @implements module:model/AnswerWithoutData
     * @implements module:model/NoAnswersFound
     * @param template {String} 
     * @param title {String} 
     * @param templateData {module:model/AnswerWithoutDataAllOfTemplateData} 
     * @param message {String} 
     * @param querySuggestions {Array.<String>} 
     */
    constructor(template, title, templateData, message, querySuggestions) { 
        LinkTextBlockAnswer.initialize(this, template, title, templateData);TextBlockFootingAnswer.initialize(this, template, title, templateData);PercentChangeLabelAnswer.initialize(this, template, title, templateData);ValueChangeDateLabelAnswer.initialize(this, template, title, templateData);RankedTableAnswer.initialize(this, template, title, templateData);TableAnswer.initialize(this, template, title, templateData);TableTableAnswer.initialize(this, template, title, templateData);ValueLabelAnswer.initialize(this, template, title, templateData);ValueLabelDateAnswer.initialize(this, template, title, templateData);ColoredValueLabelDateAnswer.initialize(this, template, title, templateData);ValueLabelDateTextBlockAnswer.initialize(this, template, title, templateData);ValueLabelDateDataPairListAnswer.initialize(this, template, title, templateData);LabelValueChangeLabelValueChangeAnswer.initialize(this, template, title, templateData);AnswerWithoutData.initialize(this, template, message, title, templateData);NoAnswersFound.initialize(this, template, message, querySuggestions);
        DataAnswerData.initialize(this, template, title, templateData, message, querySuggestions);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, template, title, templateData, message, querySuggestions) { 
        obj['template'] = template;
        obj['title'] = title;
        obj['templateData'] = templateData;
        obj['message'] = message;
        obj['querySuggestions'] = querySuggestions;
    }

    /**
     * Constructs a <code>DataAnswerData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/DataAnswerData} obj Optional instance to populate.
     * @return {module:model/DataAnswerData} The populated <code>DataAnswerData</code> instance.
     */
    static constructFromObject(data, obj) {
        switch (data['template']) {
            case 'AnswerWithoutDataTemplate':
              return AnswerWithoutData.constructFromObject(data, obj);
            case 'ColoredValueLabelDateTemplate':
              return ColoredValueLabelDateAnswer.constructFromObject(data, obj);
            case 'LabelValueChangeLabelValueChangeTemplate':
              return LabelValueChangeLabelValueChangeAnswer.constructFromObject(data, obj);
            case 'LinkTextBlockTemplate':
              return LinkTextBlockAnswer.constructFromObject(data, obj);
            case 'NoAnswerTemplate':
              return NoAnswersFound.constructFromObject(data, obj);
            case 'PercentChangeLabelTemplate':
              return PercentChangeLabelAnswer.constructFromObject(data, obj);
            case 'RankedTableTemplate':
              return RankedTableAnswer.constructFromObject(data, obj);
            case 'TableTableTemplate':
              return TableTableAnswer.constructFromObject(data, obj);
            case 'TableTemplate':
              return TableAnswer.constructFromObject(data, obj);
            case 'TextBlockFootingTemplate':
              return TextBlockFootingAnswer.constructFromObject(data, obj);
            case 'ValueChangeDateLabelTemplate':
              return ValueChangeDateLabelAnswer.constructFromObject(data, obj);
            case 'ValueLabelDateDataPairListTemplate':
              return ValueLabelDateDataPairListAnswer.constructFromObject(data, obj);
            case 'ValueLabelDateTemplate':
              return ValueLabelDateAnswer.constructFromObject(data, obj);
            case 'ValueLabelDateTextBlockTemplate':
              return ValueLabelDateTextBlockAnswer.constructFromObject(data, obj);
            case 'ValueLabelTemplate':
              return ValueLabelAnswer.constructFromObject(data, obj);
        }
        return obj;
    }


}

/**
 * @member {String} template
 */
DataAnswerData.prototype['template'] = undefined;

/**
 * @member {String} title
 */
DataAnswerData.prototype['title'] = undefined;

/**
 * @member {module:model/AnswerWithoutDataAllOfTemplateData} templateData
 */
DataAnswerData.prototype['templateData'] = undefined;

/**
 * @member {String} message
 */
DataAnswerData.prototype['message'] = undefined;

/**
 * @member {Array.<String>} querySuggestions
 */
DataAnswerData.prototype['querySuggestions'] = undefined;


// Implement LinkTextBlockAnswer interface:
/**
 * @member {String} template
 */
LinkTextBlockAnswer.prototype['template'] = undefined;
/**
 * @member {String} title
 */
LinkTextBlockAnswer.prototype['title'] = undefined;
/**
 * @member {module:model/LinkTextBlockTemplateData} templateData
 */
LinkTextBlockAnswer.prototype['templateData'] = undefined;
// Implement TextBlockFootingAnswer interface:
/**
 * @member {String} template
 */
TextBlockFootingAnswer.prototype['template'] = undefined;
/**
 * @member {String} title
 */
TextBlockFootingAnswer.prototype['title'] = undefined;
/**
 * @member {module:model/TextBlockFootingTemplateData} templateData
 */
TextBlockFootingAnswer.prototype['templateData'] = undefined;
// Implement PercentChangeLabelAnswer interface:
/**
 * @member {String} template
 */
PercentChangeLabelAnswer.prototype['template'] = undefined;
/**
 * @member {String} title
 */
PercentChangeLabelAnswer.prototype['title'] = undefined;
/**
 * @member {module:model/PercentChangeLabelTemplateData} templateData
 */
PercentChangeLabelAnswer.prototype['templateData'] = undefined;
// Implement ValueChangeDateLabelAnswer interface:
/**
 * @member {String} template
 */
ValueChangeDateLabelAnswer.prototype['template'] = undefined;
/**
 * @member {String} title
 */
ValueChangeDateLabelAnswer.prototype['title'] = undefined;
/**
 * @member {module:model/ValueChangeDateLabelTemplateData} templateData
 */
ValueChangeDateLabelAnswer.prototype['templateData'] = undefined;
// Implement RankedTableAnswer interface:
/**
 * @member {String} template
 */
RankedTableAnswer.prototype['template'] = undefined;
/**
 * @member {String} title
 */
RankedTableAnswer.prototype['title'] = undefined;
/**
 * @member {module:model/RankedTableTemplateData} templateData
 */
RankedTableAnswer.prototype['templateData'] = undefined;
// Implement TableAnswer interface:
/**
 * @member {String} template
 */
TableAnswer.prototype['template'] = undefined;
/**
 * @member {String} title
 */
TableAnswer.prototype['title'] = undefined;
/**
 * @member {module:model/TableTemplateData} templateData
 */
TableAnswer.prototype['templateData'] = undefined;
// Implement TableTableAnswer interface:
/**
 * @member {String} template
 */
TableTableAnswer.prototype['template'] = undefined;
/**
 * @member {String} title
 */
TableTableAnswer.prototype['title'] = undefined;
/**
 * @member {module:model/TableTableTemplateData} templateData
 */
TableTableAnswer.prototype['templateData'] = undefined;
// Implement ValueLabelAnswer interface:
/**
 * @member {String} template
 */
ValueLabelAnswer.prototype['template'] = undefined;
/**
 * @member {String} title
 */
ValueLabelAnswer.prototype['title'] = undefined;
/**
 * @member {module:model/ValueLabelTemplateData} templateData
 */
ValueLabelAnswer.prototype['templateData'] = undefined;
// Implement ValueLabelDateAnswer interface:
/**
 * @member {String} template
 */
ValueLabelDateAnswer.prototype['template'] = undefined;
/**
 * @member {String} title
 */
ValueLabelDateAnswer.prototype['title'] = undefined;
/**
 * @member {module:model/ValueLabelDateTemplateData} templateData
 */
ValueLabelDateAnswer.prototype['templateData'] = undefined;
// Implement ColoredValueLabelDateAnswer interface:
/**
 * @member {String} template
 */
ColoredValueLabelDateAnswer.prototype['template'] = undefined;
/**
 * @member {String} title
 */
ColoredValueLabelDateAnswer.prototype['title'] = undefined;
/**
 * @member {module:model/ColoredValueLabelDateTemplateData} templateData
 */
ColoredValueLabelDateAnswer.prototype['templateData'] = undefined;
// Implement ValueLabelDateTextBlockAnswer interface:
/**
 * @member {String} template
 */
ValueLabelDateTextBlockAnswer.prototype['template'] = undefined;
/**
 * @member {String} title
 */
ValueLabelDateTextBlockAnswer.prototype['title'] = undefined;
/**
 * @member {module:model/ValueLabelDateTextBlockTemplateData} templateData
 */
ValueLabelDateTextBlockAnswer.prototype['templateData'] = undefined;
// Implement ValueLabelDateDataPairListAnswer interface:
/**
 * @member {String} template
 */
ValueLabelDateDataPairListAnswer.prototype['template'] = undefined;
/**
 * @member {String} title
 */
ValueLabelDateDataPairListAnswer.prototype['title'] = undefined;
/**
 * @member {module:model/ValueLabelDateDataPairListTemplateData} templateData
 */
ValueLabelDateDataPairListAnswer.prototype['templateData'] = undefined;
// Implement LabelValueChangeLabelValueChangeAnswer interface:
/**
 * @member {String} template
 */
LabelValueChangeLabelValueChangeAnswer.prototype['template'] = undefined;
/**
 * @member {String} title
 */
LabelValueChangeLabelValueChangeAnswer.prototype['title'] = undefined;
/**
 * @member {module:model/LabelValueChangeLabelValueChangeTemplateData} templateData
 */
LabelValueChangeLabelValueChangeAnswer.prototype['templateData'] = undefined;
// Implement AnswerWithoutData interface:
/**
 * @member {String} template
 */
AnswerWithoutData.prototype['template'] = undefined;
/**
 * @member {String} message
 */
AnswerWithoutData.prototype['message'] = undefined;
/**
 * @member {String} title
 */
AnswerWithoutData.prototype['title'] = undefined;
/**
 * @member {module:model/AnswerWithoutDataAllOfTemplateData} templateData
 */
AnswerWithoutData.prototype['templateData'] = undefined;
// Implement NoAnswersFound interface:
/**
 * @member {String} template
 */
NoAnswersFound.prototype['template'] = undefined;
/**
 * @member {String} message
 */
NoAnswersFound.prototype['message'] = undefined;
/**
 * @member {Array.<String>} querySuggestions
 */
NoAnswersFound.prototype['querySuggestions'] = undefined;




export default DataAnswerData;

