/**
 * Natural Language Processing API
 * APIs that leverage Natural Language Processing to help extract meaningful data from unstructured text
 *
 * The version of the OpenAPI document: 1.3.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import QnAAnswerParameters from './QnAAnswerParameters';

/**
 * The QnAAnswerParametersRoot model module.
 * @module model/QnAAnswerParametersRoot
 */
class QnAAnswerParametersRoot {
    /**
     * Constructs a new <code>QnAAnswerParametersRoot</code>.
     * Schema that envelopes the &#x60;QnAAnswerParameters&#x60; and include additional &#x60;meta&#x60; (if available).
     * @alias module:model/QnAAnswerParametersRoot
     * @param data {module:model/QnAAnswerParameters} 
     */
    constructor(data) { 
        
        QnAAnswerParametersRoot.initialize(this, data);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, data) { 
        obj['data'] = data;
    }

    /**
     * Constructs a <code>QnAAnswerParametersRoot</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/QnAAnswerParametersRoot} obj Optional instance to populate.
     * @return {module:model/QnAAnswerParametersRoot} The populated <code>QnAAnswerParametersRoot</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new QnAAnswerParametersRoot();

            if (data.hasOwnProperty('data')) {
                obj['data'] = QnAAnswerParameters.constructFromObject(data['data']);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = ApiClient.convertToType(data['meta'], Object);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/QnAAnswerParameters} data
 */
QnAAnswerParametersRoot.prototype['data'] = undefined;

/**
 * @member {Object} meta
 */
QnAAnswerParametersRoot.prototype['meta'] = undefined;






export default QnAAnswerParametersRoot;
