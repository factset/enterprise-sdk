/**
 * PA Engine API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.16.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The PACommentaryStatus model module.
 * @module model/PACommentaryStatus
 */
class PACommentaryStatus {
    /**
     * Constructs a new <code>PACommentaryStatus</code>.
     * @alias module:model/PACommentaryStatus
     */
    constructor() { 
        
        PACommentaryStatus.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PACommentaryStatus</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PACommentaryStatus} obj Optional instance to populate.
     * @return {module:model/PACommentaryStatus} The populated <code>PACommentaryStatus</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PACommentaryStatus();

            if (data.hasOwnProperty('result')) {
                obj['result'] = ApiClient.convertToType(data['result'], 'String');
            }
            if (data.hasOwnProperty('calculationid')) {
                obj['calculationid'] = ApiClient.convertToType(data['calculationid'], 'String');
            }
            if (data.hasOwnProperty('unitid')) {
                obj['unitid'] = ApiClient.convertToType(data['unitid'], 'String');
            }
            if (data.hasOwnProperty('status')) {
                obj['status'] = ApiClient.convertToType(data['status'], 'String');
            }
        }
        return obj;
    }


}

/**
 * The result url of the generated commentary.
 * @member {String} result
 */
PACommentaryStatus.prototype['result'] = undefined;

/**
 * Calculation id.
 * @member {String} calculationid
 */
PACommentaryStatus.prototype['calculationid'] = undefined;

/**
 * Calculation unit id.
 * @member {String} unitid
 */
PACommentaryStatus.prototype['unitid'] = undefined;

/**
 * The status of commentary generation.
 * @member {module:model/PACommentaryStatus.StatusEnum} status
 */
PACommentaryStatus.prototype['status'] = undefined;





/**
 * Allowed values for the <code>status</code> property.
 * @enum {String}
 * @readonly
 */
PACommentaryStatus['StatusEnum'] = {

    /**
     * value: "Executing"
     * @const
     */
    "Executing": "Executing",

    /**
     * value: "Success"
     * @const
     */
    "Success": "Success"
};



export default PACommentaryStatus;

