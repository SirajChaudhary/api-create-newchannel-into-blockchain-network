## The API creates a new channel into your hyperlegder fabric blockchain network.

#### HowTo Steps
Step1 : Clone and Import the code into your Eclipse IDE \
Step2 : Run ApiCreateNewchannelIntoBlockchainNetworkApplication.java \
Step3 : Call the service from postman client (or any other rest client or GUI) \

Example \
#### URL
YOUR_IP_ADDRESS:2020/my-blockchain-network/create-new-channel \
#### Query Params
channelName = E.g. businesschannel \
networkPath = E.g. /home/ubuntu/fabric-samples/test-network \
#### Method
POST \

Note : In my case I have created a channel for test-network and my network path is /home/ubuntu/fabric-samples/test-network. Please modify this input param as per your network path.


![image](https://user-images.githubusercontent.com/76120970/102392100-a48dd880-3ffc-11eb-9044-55961ab3a4d7.png)
