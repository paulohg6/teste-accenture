# language: pt
@RecebeEmail
Funcionalidade: asdadadadsadsaa

  Esquema do Cenario: Preencher o formulario e enviar um email com sucesso
    Dado que você esta na pagina do sample app
    Quando você insere a make <make>
    E seleciona o model <model>
    E insere a Cylinder Capacity <cylindercapacity>
    E insere a engine performace <kw>
    E insere a date of Manufacture <dateofmanufacture>
    E seleciona o Number of Seats <numberofseats>
    E seleciona o number of seatsmotor cycle <numberofseats2>
    E seleciona o Fuel Type <fuel>
    E insere o Payload  <payload>
    E insere a Total Weight <totalweight>
    E insere o List Price  <listprice>
    E insere a Quilometragem anual anual <annualmileage>
    E clica em proximo
    E insere o First Name <firstName>
    E insere o Last Name <lastname>
    E insere a Date of Birth <birthdate>
    E seleciona o country <country>
    E insere o zipcode <zipcode>
    E seleciona a occupation <occupation>
    E clica em next na tela insurant data
    E seleciona a Star date <stardate>
    E seleciona o Insurance Sum igual a <valorInsuannce>
    E seleciona o Merit Rating igual a <meritRating>
    E seleciona o Demage Insurance igual a <dmgInsurance>
    E clica nos Optional Products desejados <optionalProducts>
    E seleciona o Cortesy Car <cortesycar>
    E clica em next na tela Product Data
    E seleciona a opcao em price option <priceOption>
    E insere o email <email>
    E insere o username <username>
    E insere o password <password>
    E insere o confirm password <confirmpassword>
    E clica em send
    Entao a mensagem <msg> aparece na tela.

    Exemplos: 
      | make   | model     | cylindercapacity | kw    | dateofmanufacture | numberofseats | numberofseats2 | fuel  | payload | totalweight | listprice | annualmileage | firstName | lastname   | birthdate    | country  | zipcode    | occupation | stardate     | valorInsuannce | meritRating   | dmgInsurance    | optionalProducts | cortesycar | priceOption | email               | username | password   | confirmpassword | msg                       |
      | "Audi" | "Scooter" | "025"            | "021" | "06/03/1995"      |             2 |              2 | "Gas" | "100"   | "1000"      | "500"     | "500"         | "Paulo"   | "Henrique" | "06/03/1995" | "Brazil" | "74565060" | "Farmer"   | "06/03/2023" | "3.000.000,00" | "Super Bonus" | "Full Coverage" |                3 | "Yes"      | "Ultimate"  | "paulo@hotmail.com" | "Paulo"  | "Teste@01" | "Teste@01"      | "Sending e-mail success!" |
