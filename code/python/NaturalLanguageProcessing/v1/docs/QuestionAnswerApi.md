# fds.sdk.NaturalLanguageProcessing.QuestionAnswerApi

All URIs are relative to *https://api.factset.com/cognitive/nlp/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**qna_get_answers**](QuestionAnswerApi.md#qna_get_answers) | **GET** /qna/answers/{id} | Endpoint to get the answer(s)
[**qna_get_status**](QuestionAnswerApi.md#qna_get_status) | **GET** /qna/answers/{id}/status | Endpoint to get the completion status for a Q&amp;A request
[**qna_post_question**](QuestionAnswerApi.md#qna_post_question) | **POST** /qna/answers | Endpoint to submit a question for answer(s)



# **qna_get_answers**
> QnAAnswerRoot qna_get_answers(id)

Endpoint to get the answer(s)

Endpoint to obtain the results from the original Q&A task request. The `id` parameter represents the identifier from the task and comes from the POST request which created the task. Once the task is complete, the result can be fetched with this endpoint.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.NaturalLanguageProcessing
from fds.sdk.NaturalLanguageProcessing.api import question__answer_api
from fds.sdk.NaturalLanguageProcessing.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
#
# The confidential client instance should be reused in production environments.
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.NaturalLanguageProcessing.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.NaturalLanguageProcessing.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.NaturalLanguageProcessing.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = question__answer_api.QuestionAnswerApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    id = "id_example" # str | Identifier from the Question & Answer task and comes from the POST request which created the task

    try:
        # Endpoint to get the answer(s)
        # example passing only required values which don't have defaults set
        api_response_wrapper = api_instance.qna_get_answers(id)

        # This endpoint returns a response wrapper that contains different types of responses depending on the query.
        # To access the correct response type, you need to perform one additional step, as shown below.
        if api_response_wrapper.get_status_code() == 200:
            api_response = api_response_wrapper.get_response_200()
        if api_response_wrapper.get_status_code() == 202:
            api_response = api_response_wrapper.get_response_202()

        pprint(api_response)

    except fds.sdk.NaturalLanguageProcessing.ApiException as e:
        print("Exception when calling QuestionAnswerApi->qna_get_answers: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Identifier from the Question &amp; Answer task and comes from the POST request which created the task |

### Return type

The endpoint generates varying objects correlating with the successful status code, encapsulated within a response wrapper housing the appropriate object. The response wrapper includes the subsequent response types:
- **200**: [**QnAAnswerRoot**](QnAAnswerRoot.md)
- **202**: [**TaskRoot**](TaskRoot.md)


### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**202** | Accepted |  * Location - The &#x60;Location&#x60; response header indicates the URL to redirect a page to. <br>  |
**401** | The server could not verify that you are authorized to access the URL requested. You either supplied the wrong credentials (e.g. a bad password), or your browser doesn&#39;t understand how to supply the credentials required. |  -  |
**404** | The requested URL was not found on the server. If you entered the URL manually please check your spelling and try again. |  -  |
**500** | The server encountered an internal error and was unable to complete your request. Either the server is overloaded or there is an error in the application. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **qna_get_status**
> TaskRoot qna_get_status(id)

Endpoint to get the completion status for a Q&A request

Endpoint to obtain the status of the Q&A task request. The `id` parameter represents the identifier of the task created and comes from the POST request which created the task.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.NaturalLanguageProcessing
from fds.sdk.NaturalLanguageProcessing.api import question__answer_api
from fds.sdk.NaturalLanguageProcessing.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
#
# The confidential client instance should be reused in production environments.
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.NaturalLanguageProcessing.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.NaturalLanguageProcessing.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.NaturalLanguageProcessing.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = question__answer_api.QuestionAnswerApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    id = "id_example" # str | Identifier from the Question & Answer task and comes from the POST request which created the task

    try:
        # Endpoint to get the completion status for a Q&A request
        # example passing only required values which don't have defaults set
        api_response = api_instance.qna_get_status(id)

        pprint(api_response)

    except fds.sdk.NaturalLanguageProcessing.ApiException as e:
        print("Exception when calling QuestionAnswerApi->qna_get_status: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Identifier from the Question &amp; Answer task and comes from the POST request which created the task |

### Return type

[**TaskRoot**](TaskRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  * Location - The &#x60;Location&#x60; response header indicates the URL to redirect a page to. <br>  |
**202** | Accepted |  * Location - The &#x60;Location&#x60; response header indicates the URL to redirect a page to. <br>  |
**401** | The server could not verify that you are authorized to access the URL requested. You either supplied the wrong credentials (e.g. a bad password), or your browser doesn&#39;t understand how to supply the credentials required. |  -  |
**404** | The requested URL was not found on the server. If you entered the URL manually please check your spelling and try again. |  -  |
**500** | The server encountered an internal error and was unable to complete your request. Either the server is overloaded or there is an error in the application. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **qna_post_question**
> TaskRoot qna_post_question(qn_a_answer_parameters_root)

Endpoint to submit a question for answer(s)

Endpoint to create a task submission by providing plain text and question(s). The underlying model will answer the question. The created task needs to be polled to obtain the results. Please check the schema(s) for each of the status codes for more details about the task.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.NaturalLanguageProcessing
from fds.sdk.NaturalLanguageProcessing.api import question__answer_api
from fds.sdk.NaturalLanguageProcessing.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
#
# The confidential client instance should be reused in production environments.
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.NaturalLanguageProcessing.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.NaturalLanguageProcessing.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.NaturalLanguageProcessing.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = question__answer_api.QuestionAnswerApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    qn_a_answer_parameters_root = QnAAnswerParametersRoot(
        data=QnAAnswerParameters(
            input='''
Matchbox.io Uses Voice-First Games as A Natural Way of Learning
matchbox.ioCredit: matchbox.io
Alexa and gaming have been rubbing shoulders since day one. From guiding children through LEGO adventures to multi-player trivia games for bored drivers, Voice has proven to be the new frontier of gaming.
When voice assistants first bobbed into the mainstream, marketing solution architect and data scientist Joel Wilson immediately saw the potential of Voice not only for games, but for education. He started his venture with the Alexa skill Question of the Day, a simple trivia game that poses a different question each day. Over 4,000 five-star reviews and hundreds of thousands of users later, it has become a routine skill for people happy to learn something new every day.
"We're on a mission to enable frictionless learning," Wilson told Amazon. "We've just scratched the surface of how we can do that with voice-first games."
Meet matchbox.io
In 2017, Wilson founded the voice-first gaming company matchbox.io, dedicated to creating interactive, educational experiences through Amazon Alexa and, more recently, Samsung Bixby. In just a few years, matchbox.io has become a recognized leader in educational games on voice-first devices.
With Question of the Day growing into one of the most popular and highest rated skills in the Alexa Skill Store, Wilson and his team of Data Scientists and Education Innovators immersed themselves in helping people learn more about the world through Voice. Before long, they launched another educational skill called Kids Quiz.
Kids Quiz poses new questions every day for children ages 5-12, from animals and science to brainteasers and fun facts. They can also collect stars and unlock surprises as they go. Another addition to the matchbox.io repertoire is Three Questions, which provides, well, three questions a day rather than just one. Like their other skills, players can earn points and unlock bonus content.
With three successful voice-first experiences under their belt, matchbox.io is marching forward with their mission to leverage Voice to disperse a little bit more knowledge to their users every single day.

Why Voice for learning?
At this point, the question is almost rhetorical. We've seen games capture the short attention spans of children, teach stubborn students and professionals new skills, and hold the curiosity of busy adults for decades. With Voice, the captivating effect of gaming is multiplied by the prospect of playing with increasingly less effort. There are no controls to untangle (or fight over), no keyboard to pound repeatedly, and no limitation for people with limited vision or mobility.
"Voice is the perfect, most accessible interface for gaming," says Wilson in an Amazon blog post. "We can tailor the experience to customers wants and needs, so they can learn something quick, hear more in-depth info about a particular fact, or settle in for an extended game play."
With over 6 million users playing his company's voice-first gaming apps, it's clear that the marriage between Voice and traditional learning is set for the long-run. The question now is which gaming companies will take advantage of it.

The future of voice-first gaming
Using Voice for interactive learning is all well and good, but what about the business side of things?
Wilson knows a few things about this too. Feeling confident about their skills' continued popularity, they made a move to monetize them with In-Skill Purchasing (ISP). This feature allows the company to fund the creation of more educational experiences by adding paid, premium content to their apps. This way, they can keep their users engaged while safely sustaining their business.
Wilson believes that this is the future of voice-first gaming industry. In his eyes, all you need is a good idea, quality content, and the smarts to know how and when to monetize it. As voice assistants and devices evolve, however, so will the methods to run a successful business with them. But Wilson is already dabbling in new ways to make his passion for learning and gaming a long-term venture.
"There's still a lot to be explored with Voice gaming," says Wilson.
To learn so much more about Voice and gaming experiences, you'll be excited to know that Wilson will be at VOICE Summit to share design and strategy insights alongside equally bright minds from Gamefuly, Drivetime, and V Group Inc.

Don't miss their talk "Gaming in the voice-first era," and make sure you stick around for hundreds more sessions, workshops, expert panels, and our exclusive VOICE Awards dinner. It's the world's largest voice tech event and we're pulling out all the stops. To join us at our annual showdown and have a summer you'll never forget, snatch one of the very last tickets!
''',
            number_of_answers=2,
            question="Who is the founder?",
        ),
        meta={},
    ) # QnAAnswerParametersRoot | 

    try:
        # Endpoint to submit a question for answer(s)
        # example passing only required values which don't have defaults set
        api_response = api_instance.qna_post_question(qn_a_answer_parameters_root)

        pprint(api_response)

    except fds.sdk.NaturalLanguageProcessing.ApiException as e:
        print("Exception when calling QuestionAnswerApi->qna_post_question: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qn_a_answer_parameters_root** | [**QnAAnswerParametersRoot**](QnAAnswerParametersRoot.md)|  |

### Return type

[**TaskRoot**](TaskRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Accepted |  * Location - The &#x60;Location&#x60; response header indicates the URL to redirect a page to. <br>  |
**400** | The browser (or proxy) sent a request that this server could not understand. |  -  |
**401** | The server could not verify that you are authorized to access the URL requested. You either supplied the wrong credentials (e.g. a bad password), or your browser doesn&#39;t understand how to supply the credentials required. |  -  |
**500** | The server encountered an internal error and was unable to complete your request. Either the server is overloaded or there is an error in the application. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

