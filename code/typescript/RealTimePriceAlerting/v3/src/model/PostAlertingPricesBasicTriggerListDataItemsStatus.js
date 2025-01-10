/**
 * Real-Time Price Alerting API
 * The Price Alerting API is designed to inform the users of an application directly about important changes in the data on the platform. The endpoint group *basic price alerting* deals with generation of alerts based on current price data. For notations, users can define an upper or lower limit and choose on which price type those limit conditions apply.  Alerting uses the concepts of triggers and alerts.   * A trigger is an entity that is set up by an application to watch a certain condition in the market data around a financial instrument.   The standard conditions that can be applied are lower limit and upper limit for the value of the price for a given financial instrument. * When the condition of a trigger is met, an alert is created. Each alert thus represents one event where a trigger condition was met.  An application can learn about the creation of alerts in two ways: The application can actively request the list of alerts (pull approach) or it can subscribe to the list of existing alerts. If a new alert is created, that list changes and the application is notified about the new alert with an update that contains the details on the new alert (push approach).  The API supports both approaches. The push approach is realized most easily by using the subscription support that the client libraries provide.  See the [Real-Time Quotes API](https://developer.factset.com/api-catalog/real-time-quotes-api) for access to detailed price information.  Note: As part of the general trial access, endpoints to write data are excluded. For a description of the full alerting API, please work with a FactSet consultant and see https://endpointreference.factset.com. 
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The PostAlertingPricesBasicTriggerListDataItemsStatus model module.
 * @module model/PostAlertingPricesBasicTriggerListDataItemsStatus
 */
class PostAlertingPricesBasicTriggerListDataItemsStatus {
    /**
     * Constructs a new <code>PostAlertingPricesBasicTriggerListDataItemsStatus</code>.
     * Status of the trigger.
     * @alias module:model/PostAlertingPricesBasicTriggerListDataItemsStatus
     */
    constructor() { 
        
        PostAlertingPricesBasicTriggerListDataItemsStatus.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PostAlertingPricesBasicTriggerListDataItemsStatus</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PostAlertingPricesBasicTriggerListDataItemsStatus} obj Optional instance to populate.
     * @return {module:model/PostAlertingPricesBasicTriggerListDataItemsStatus} The populated <code>PostAlertingPricesBasicTriggerListDataItemsStatus</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PostAlertingPricesBasicTriggerListDataItemsStatus();

            if (data.hasOwnProperty('code')) {
                obj['code'] = ApiClient.convertToType(data['code'], 'String');
            }
            if (data.hasOwnProperty('details')) {
                obj['details'] = ApiClient.convertToType(data['details'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Code of the status. | Value | Description | | --- | --- | | active | The trigger is active and trigger conditions are evaluated. | | inactive | The trigger is inactive and conditions do not generate alerts | | error | The trigger is in an error state, error details are noted in \"details\" |  
 * @member {module:model/PostAlertingPricesBasicTriggerListDataItemsStatus.CodeEnum} code
 */
PostAlertingPricesBasicTriggerListDataItemsStatus.prototype['code'] = undefined;

/**
 * A human-readable, unstructured explanation specific to this error.
 * @member {String} details
 */
PostAlertingPricesBasicTriggerListDataItemsStatus.prototype['details'] = undefined;





/**
 * Allowed values for the <code>code</code> property.
 * @enum {String}
 * @readonly
 */
PostAlertingPricesBasicTriggerListDataItemsStatus['CodeEnum'] = {

    /**
     * value: "active"
     * @const
     */
    "active": "active",

    /**
     * value: "inactive"
     * @const
     */
    "inactive": "inactive",

    /**
     * value: "error"
     * @const
     */
    "error": "error"
};



export default PostAlertingPricesBasicTriggerListDataItemsStatus;

