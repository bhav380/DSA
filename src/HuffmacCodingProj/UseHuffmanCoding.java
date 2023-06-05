package HuffmacCodingProj;

public class UseHuffmanCoding {

	public static void main(String[] args) throws IndexNotFoundException {
		// TODO Auto-generated method 		
		HuffmanCoding dataBase = new HuffmanCoding();		
		dataBase.insert("abaabbbc");
		dataBase.getData(0);
		
		dataBase.deleteData(0);
		
		dataBase.insert("dkdddddddddddddddddgggggggggggggggggjjjjjjjjkfjeokdkfiekjvdkfju");
		dataBase.getData(0);
		
		
		System.out.println("Lorem ispsum Save in Binary");
		System.out.println("\n\n");
		dataBase.insert("What is Lorem Ipsum?"
				+ "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.\r\n"
				+ "\r\n"
				+ "Why do we use it?\r\n"
				+ "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "Where does it come from?\r\n"
				+ "Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32.\r\n"
				+ "\r\n"
				+ "The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackham.\r\n"
				+ "\r\n"
				+ "Where can I get some?\r\n"
				+ "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text. All the Lorem Ipsum generators on the Internet tend to repeat predefined chunks as necessary, making this the first true generator on the Internet. It uses a dictionary of over 200 Latin words, combined with a handful of model sentence structures, to generate Lorem Ipsum which looks reasonable. The generated Lorem Ipsum is therefore always free from repetition, injected humour, or non-characteristic words etc.\r\n"
				+ "\r\n"
				+ "5\r\n"
				+ "	paragraphs\r\n"
				+ "	words\r\n"
				+ "	bytes\r\n"
				+ "	lists\r\n"
				+ "	Start with 'Lorem\r\n"
				+ "ipsum dolor sit amet...'\r\n"
				+ "\r\n"
				+ "Translations: Can you help translate this site into a foreign language ? Please email us with details if you can help.\r\n"
				+ "There is a set of mock banners available here in three colours and in a range of standard banner sizes:\r\n"
				+ "BannersBannersBanners\r\n"
				+ "Donate: If you use this site regularly and would like to help keep the site on the Internet, please consider donating a small sum to help pay for the hosting and bandwidth bill. There is no minimum donation, any sum is appreciated - click here to donate using PayPal. Thank you for your support.\r\n"
				+ "Donate Bitcoin: 16UQLq1HZ3CNwhvgrarV6pMoA2CDjb4tyF\r\n"
				+ "NodeJS Python Interface GTK Lipsum Rails .NET Groovy\r\n"
				+ "The standard Lorem Ipsum passage, used since the 1500s\r\n"
				+ "\"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\"\r\n"
				+ "\r\n"
				+ "Section 1.10.32 of \"de Finibus Bonorum et Malorum\", written by Cicero in 45 BC\r\n"
				+ "\"Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur?\"\r\n"
				+ "\r\n"
				+ "1914 translation by H. Rackham\r\n"
				+ "\"But I must explain to you how all this mistaken idea of denouncing pleasure and praising pain was born and I will give you a complete account of the system, and expound the actual teachings of the great explorer of the truth, the master-builder of human happiness. No one rejects, dislikes, or avoids pleasure itself, because it is pleasure, but because those who do not know how to pursue pleasure rationally encounter consequences that are extremely painful. Nor again is there anyone who loves or pursues or desires to obtain pain of itself, because it is pain, but because occasionally circumstances occur in which toil and pain can procure him some great pleasure. To take a trivial example, which of us ever undertakes laborious physical exercise, except to obtain some advantage from it? But who has any right to find fault with a man who chooses to enjoy a pleasure that has no annoying consequences, or one who avoids a pain that produces no resultant pleasure?\"\r\n"
				+ "\r\n"
				+ "Section 1.10.33 of \"de Finibus Bonorum et Malorum\", written by Cicero in 45 BC\r\n"
				+ "\"At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique sunt in culpa qui officia deserunt mollitia animi, id est laborum et dolorum fuga. Et harum quidem rerum facilis est et expedita distinctio. Nam libero tempore, cum soluta nobis est eligendi optio cumque nihil impedit quo minus id quod maxime placeat facere possimus, omnis voluptas assumenda est, omnis dolor repellendus. Temporibus autem quibusdam et aut officiis debitis aut rerum necessitatibus saepe eveniet ut et voluptates repudiandae sint et molestiae non recusandae. Itaque earum rerum hic tenetur a sapiente delectus, ut aut reiciendis voluptatibus maiores alias consequatur aut perferendis doloribus asperiores repellat.\"\r\n"
				+ "\r\n"
				+ "1914 translation by H. Rackham\r\n"
				+ "\"On the other hand, we denounce with righteous indignation and dislike men who are so beguiled and demoralized by the charms of pleasure of the moment, so blinded by desire, that they cannot foresee the pain and trouble that are bound to ensue; and equal blame belongs to those who fail in their duty through weakness of will, which is the same as saying through shrinking from toil and pain. These cases are perfectly simple and easy to distinguish. In a free hour, when our power of choice is untrammelled and when nothing prevents our being able to do what we like best, every pleasure is to be welcomed and every pain avoided. But in certain circumstances and owing to the claims of duty or the obligations of business it will frequently occur that pleasures have to be repudiated and annoyances accepted. The wise man therefore always holds in these matters to this principle of selection: he rejects pleasures to secure other greater pleasures, or else he endures pains to avoid worse pains.\"\r\n"
				+ "\r\n"
				+ "help@lipsum.com\r\n"
				+ "Privacy Policy\r\n"
				+ ">");
		
		dataBase.getData(1);
		
		dataBase.insert("Once upon a time, in a faraway land, there lived a young prince named Alexander. He was known for his courage, wisdom, and kindness towards his subjects. Alexander was the heir to the throne, and he had been groomed from a young age to become a wise and just ruler.\r\n"
				+ "\r\n"
				+ "One day, while riding through the lush forests that surrounded his castle, Alexander stumbled upon a hidden glade he had never seen before. Intrigued, he dismounted his horse and ventured into the glade, curious to explore its secrets.\r\n"
				+ "\r\n"
				+ "As he delved deeper into the glade, Alexander noticed a faint glowing light emanating from a grove of ancient trees. He followed the light, guided by his curiosity, until he reached a clearing where a mysterious figure awaited him.\r\n"
				+ "\r\n"
				+ "The figure was an elderly woman with a wrinkled face and bright, piercing eyes. She introduced herself as Elara, the guardian of the glade. Elara told Alexander that he had been chosen to embark on a quest that would test his mettle and shape his destiny.\r\n"
				+ "\r\n"
				+ "Alexander, ever eager for adventure, accepted the challenge without hesitation. Elara explained that he must journey to the four corners of the kingdom and retrieve four precious artifacts, each guarded by a formidable creature. Only by obtaining all four artifacts could Alexander fulfill his destiny and claim his rightful place as king.\r\n"
				+ "\r\n"
				+ "With a sense of determination burning within him, Alexander set out on his quest. He faced many challenges along the way, including treacherous mountains, dense forests, and raging rivers. He battled fearsome beasts and overcame countless obstacles, relying on his courage, intelligence, and the unwavering support of his loyal companions.\r\n"
				+ "\r\n"
				+ "As Alexander traveled across the kingdom, he met people from all walks of life - from humble farmers to cunning thieves to wise sages. He learned valuable lessons about leadership, compassion, and the importance of listening to others. Along the way, he made friends, earned the respect of his subjects, and won the hearts of his people.\r\n"
				+ "\r\n"
				+ "After months of arduous travel and countless trials, Alexander finally obtained all four artifacts. With his heart swelling with pride and gratitude, he returned to the glade where Elara awaited him. She congratulated him on his success and revealed that the artifacts were not just symbols of power, but also tools to bring prosperity and harmony to the kingdom.\r\n"
				+ "\r\n"
				+ "Elara bestowed upon Alexander a golden crown, signifying his ascension to the throne. The people rejoiced as Alexander was crowned king, and he vowed to rule with wisdom, fairness, and compassion. Under his reign, the kingdom flourished, and the people lived in peace and prosperity.\r\n"
				+ "\r\n"
				+ "Alexander's legacy as a wise and just ruler spread far and wide, and his reign was remembered as a golden era in the kingdom's history. He ruled with grace and wisdom, always mindful of the lessons he had learned during his quest. His name became synonymous with courage, integrity, and selflessness, and his story was passed down through generations as a tale of inspiration and hope.\r\n"
				+ "\r\n"
				+ "And so, Alexander's journey from a young prince to a beloved king became a legend, etched in the annals of history as a testament to the power of determination, courage, and the indomitable spirit of a true leader.");	
		
		dataBase.getData(2);
		dataBase.insert("aaaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccccccccccccccccdddddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffffffffffffffffffggggggggggggggggggggggggggggggggghhhhhhhhhhhhhhhhhhhhhhhhhhhhhhiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiijjjjjjjjjjjjjjjjjjjjjjjjjjkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkklllllllllllllllllllllllllllllllllmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnooooooooooooooooooooooooooooopppppppppppppppppppppppppppppppppppppppqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrsssssssssssssssssssssssssssssssssstttttttttttttttttttttttttttttttttttttuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
	    dataBase.getData(3);
	    
	    dataBase.deleteData(3);
	    

	}

}
